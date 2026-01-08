package Chapter55.e4;

public class SignalProcessor {
    private int[] data = new int[0];
    private final int id;

    private static int objectCounter = 0;
    private static long globalSignalSum;

    public SignalProcessor(){
        this.id = ++objectCounter;
    }

    public void addSignal(int... newSignals){
        int[] newData = new int[(this.data.length+newSignals.length)];
        int signalsCounter = 0;
        for(int i = 0; i<newData.length; i++){
            if(i < this.data.length){
                newData[i] = this.data[i];
            } else {
                globalSignalSum+= newSignals[signalsCounter];
                newData[i] = newSignals[signalsCounter++];
            }
        }
        this.data = newData;

    }

    public boolean detectPattern(int... pattern){
        int patternSize = pattern.length;
        int counter = 0;
        if (patternSize == 0){
            return false;
        }

        for(int i = 0; i < this.data.length; i++){
            if(this.data[i]==pattern[counter]){
                counter++;
                if(counter==patternSize){
                    return true;
                }
            } else {
                if(counter > 0){
                    i = i - counter;
                    counter = 0;
                }
            }
        }
        return false;
    }

    public void removeSignal(int value){
        int size = this.data.length;
        for(int i : this.data){
            if(i==value){
                size--;
                globalSignalSum-=i;
            }
        }
        int[] newData = new int[size];
        int newDataCounter = 0;

        if(size == 0){
            this.data = new int[0];
            return;
        }

        for(int i = 0; i < this.data.length; i++){
            int v = this.data[i];
            if(v!=value){
                newData[newDataCounter++] = v;
            }
        }
        this.data = newData;
    }

    public void removeSignal(int start, int end){
        int newSize = this.data.length - (end - start + 1);
        int[] newData = new int[newSize];
        int k = 0;

        for (int i = 0; i < this.data.length; i++){
            if(i<=end && i>= start){
                globalSignalSum-= this.data[i];
                continue;
            }
            newData[k++] = this.data[i];
        }

        data = newData;
    }

    public void transferDataFrom(SignalProcessor other){
        int newSize = (this.data.length + other.data.length);
        int[] newData = new int[newSize];
        int otherDataCounter = 0;

        for(int i = 0; i < newSize; i++){
            if(i < this.data.length){
                newData[i] = this.data[i];
            } else {
                newData[i] = other.data[otherDataCounter++];
            }
        }
        this.data = newData;

        other.data = new int[0];

    }

    public static void main(String[] args){
        SignalProcessor p1 = new SignalProcessor();
        p1.addSignal(1, 2, 3, 4, 5);
        SignalProcessor p2 = new SignalProcessor();
        p2.addSignal(10,20);

        System.out.println(p1.detectPattern(2,3,4));
        p1.removeSignal(3);
        p2.transferDataFrom(p1);

        for(int i : p2.data){
            System.out.println(i);
        }
        System.out.println("\n Now the total sum:");
        System.out.println(globalSignalSum);
    }
}
