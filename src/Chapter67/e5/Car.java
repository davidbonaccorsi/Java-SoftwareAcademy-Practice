package Chapter67.e5;

public class Car extends Vehicle {

    public Car(String name){
        this(name, 200);
        System.out.println("Name-only constructor ");
    }

    public Car(String name, int topSpeed){
        super(name, topSpeed);
        System.out.println("Car full constructor ");
    }

    @Override
    public void drive(){
        System.out.println("Car driving ");
    }

    @Override
    public void accelerate(){
        System.out.println("Car accelerating ");
    }
}
