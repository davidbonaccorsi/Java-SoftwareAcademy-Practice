package Chapter67.e3;

public class HomeHub {

    public static void main(String[] args){
        SmartLight fL = new SmartLight(1, 80);
        SmartCamera fC = new SmartCamera(2, 50.5);
        SmartLight sL = new SmartLight(1, 80);

        System.out.println(fL.equals(sL));
        System.out.println(fC.statusReport());
        System.out.println(SmartDevice.deviceCount);
    }
}
