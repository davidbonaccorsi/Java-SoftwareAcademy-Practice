package Chapter67.e5;

public abstract class Vehicle {
    private final String name;
    private final int topSpeed;

    public Vehicle(String name, int topSpeed){
        this.name = name;
        this.topSpeed = topSpeed;
        System.out.println("Vehicle constructor ");
    }

    public abstract void drive();
    public abstract void accelerate();
    public String getName(){return name;}
}
