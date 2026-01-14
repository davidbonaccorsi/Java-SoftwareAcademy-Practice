package nine.exercise;

public class MarsBase {
    static int totalSupplies = 5000;
    static String missionName = "Ares V";
    static String baseStatus = "OPERATIONAL";
    static int waterLevel = 20;
    static int CrewCount = 5;
    static String rationStatus;
    static boolean systemFailure = false;
    static int lastId;

    public static void main (String[] args) {

        System.out.println("--- MISSION START: " + missionName + " ---");

        double launchWeight = 2500.50;
        int thurstPower = 1200;
        int acceleration = (int) (100 * (thurstPower / launchWeight)); // without using a times 100 the int will always be 0
        totalSupplies -= 100;
        Rover r1 = new Rover(++lastId);
        r1.Move();

        byte signal = 10;
        byte key = 5;
        int encrypted = signal ^ key;
        String signalStatus;
        signalStatus = encrypted == 15 ? "SECURE" : "COMPROMISED";
        ResourceAllocation();
        if (systemFailure = (r1.battery < 20)) {
            baseStatus = "CRTICAL";
        }

        Rover r2 = new Rover(++lastId);
        Rover r3 = r1;
        r1 = null;
        r2 = r3;
        r3 = null;

    }

    public static void ResourceAllocation(){
        rationStatus = baseStatus == "CRTICAL" ? "lockdown" : (waterLevel/CrewCount > 2 ? "normal" : "rationing");
    }

}
