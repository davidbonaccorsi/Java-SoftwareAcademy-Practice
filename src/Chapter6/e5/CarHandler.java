package Chapter6.e5;

import java.util.List;

public class CarHandler {

    public static void main(String[] args){
        Vehicle car = new Car("Toyota",200);
        Vehicle bike = new Motorcycle("Harley", 150);
        Vehicle anotherCar = new Car("Unknown BMW");

        List<Vehicle> vehicles = List.of(car, bike, anotherCar);
        vehicles.forEach(Vehicle::drive);

    }
}

