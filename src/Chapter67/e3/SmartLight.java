package Chapter67.e3;

public class SmartLight extends SmartDevice{
    private int brightness;

    public SmartLight(long id){
        super(id);
        this.brightness = 50;
        System.out.println("Lights created");
    }

    public SmartLight(long id, int brightness){
        super(id);
        if (brightness < 0 || brightness > 100){
            this.brightness = 50;
        } else {
            this.brightness = brightness;
        }
    }

    @Override
    public String statusReport(){
        return("Light ["+super.getDeviceID()+"] at ["+this.brightness+"]%");
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj instanceof SmartLight){
            return this.getDeviceID() == ((SmartLight) obj).getDeviceID() && this.brightness == ((SmartLight) obj).brightness;
        }
        return false;
    }


}
