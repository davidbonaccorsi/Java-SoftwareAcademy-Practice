package nine.exercise;

public class Rover extends MarsBase {
    int id;
    int battery = 100;
    float dataCollected;
    boolean isFunctional;

    public Rover(int id){
        this.id = id;
    }

    public void Move() {
        System.out.println("The rover started to move");
        int distanceTraveled = battery-- + 10;
        int energyUsed = --battery/2;
        boolean stable = (distanceTraveled > 100) || (battery++ > 50);

    }

}
