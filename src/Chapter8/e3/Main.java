package Chapter8.e3;

public class Main {

    public static void main(String[] args){
        Factory newFac = new Factory();
        newFac.createAndLog( () -> Main.generateSmartphone("Pro", 15), System.out::println);
    }

    public static Product generateSmartphone(String name, double price){
        return new Product(name, price);
    }
}
