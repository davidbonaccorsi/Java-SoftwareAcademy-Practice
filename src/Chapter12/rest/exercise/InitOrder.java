package rest.exercise;

public class InitOrder {
    private int x = 10;

    {
        System.out.println("First initializer: x = " + x);
        x = 20;
    }

    private int y = 30;

    {
        System.out.println("Second initializer: y = " + y);
        y = 40;
    }

    public InitOrder() {
        System.out.println("Constructor: x = " + x + ", y = " + y);
        x = 50;
        y = 60;
    }


    public static void main(String[] args) {
        InitOrder obj = new InitOrder();
        System.out.println("Final: x = " + obj.x + ", y = " + obj.y);
    }
}
