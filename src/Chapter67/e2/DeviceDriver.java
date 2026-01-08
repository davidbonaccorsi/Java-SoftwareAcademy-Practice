package Chapter67.e2;

public abstract class DeviceDriver extends KernelComponent{

    static {
        System.out.println("4. Driver Static");
    }

    public DeviceDriver(String name) {
        super(name);
        System.out.println("5. Driver Constructor");
    }


}
