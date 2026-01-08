package Chapter55.e3;

public class OverloadOlympics {

    public static void compete(int i){
        System.out.println("compete(int)");
    }

    public static void compete(long l){
        System.out.println("compete(long)");
    }

    public static void compete(Integer i){
        System.out.println("compete(Integer)");
    }

    public static void compete(int... i){
        System.out.println("compete(int... i)");
    }

    public static void main(String[] args){
        compete(5);
    }
}
