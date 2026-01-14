package Chapter6.e5;

public class Motorcycle extends Vehicle{

    public Motorcycle(String name, int topSpeed){
        super(name, topSpeed);
        System.out.println("Motorcycle constructor ");
    }

    @Override
    public void drive(){
        System.out.println("Motorcycle driving ");
    }

    @Override
    public void accelerate(){
        System.out.println("Motorcycle accelerating ");
    }
}
