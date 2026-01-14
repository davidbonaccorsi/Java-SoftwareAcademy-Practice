package Chapter6.e3;

public abstract class SmartDevice {
    private final long deviceID;
    protected double batteryLife;
    public static long deviceCount;

    public SmartDevice(long id){
        this(id,100);
    }

    public SmartDevice(long id, double battery){
        this.deviceID = id;
        this.batteryLife = battery;
        deviceCount++;
        System.out.println("Device initialized: ["+id+"] with Battery: ["+battery+"]");
    }

    public abstract Object statusReport();

    public long getDeviceID() {
        return deviceID;
    }
}
