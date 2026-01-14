package Chapter5.e3;

public class ShadowBox {
    private int size = 10;
    public static int count = 0;


    public void update(int size){
        int count = 50;
        this.size = size;
        ShadowBox.count+= count;
    }

    public void printBox(){
        System.out.println("Starting printBox...");
        System.out.println(this.size);
        System.out.println(count);
    }

    public static void main(String[] args){
        ShadowBox firstBox = new ShadowBox();
        firstBox.update(5);
        firstBox.printBox();
    }


}
