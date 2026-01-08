package Chapter55.e1;

public class Statistics {

    public static void main(String[] args) {
        Statistics stats = new Statistics();
        System.out.println(stats.average(10, 20, 30));
        System.out.println(stats.max(5, 15, 10, 25));
        System.out.println(stats.min(8, 3, 12, 6));
        System.out.println(stats.sum(1, 2, 3, 4, 5));
    }

    public double average(int... numbers) {
        if (numbers.length == 0) { return 0;}
        double total = 0;
        for(double number : numbers) {
            total+= number;
        }
        return total / numbers.length;
    }


    public double max(int... numbers){
        if (numbers.length == 0) { return 0;}
        double max = 0;
        for(double number: numbers){
            if(number > max){
                max = number;
            }
        }

        return max;
    }

    public double min(int... numbers){
        if (numbers.length == 0) { return 0;}
        double min = 0;
        for(double number: numbers){
            if(number < min){
                min = number;
            }
        }

        return min;
    }

    public double sum(int... numbers){
        if (numbers.length == 0) { return 0;}
        double sum = 0;
        for(int n : numbers){
            sum+=n;
        }

        return sum;
    }
}
