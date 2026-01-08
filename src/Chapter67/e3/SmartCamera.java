package Chapter67.e3;

public class SmartCamera extends SmartDevice{
    private boolean isRecording;

    public SmartCamera(long id, double battery){
        super(id,battery);
        System.out.println(this.isRecording);
        this.isRecording = false;
    }

    @Override
    public String statusReport(){
        return ("Camera ["+super.getDeviceID()+"] Battery: ["+super.batteryLife+"] Recording: ["+this.isRecording+"]");
    }

    public void toggleRecording(){
        this.isRecording = !this.isRecording;
    }

    public void reset(){
        System.out.println(this.getDeviceID());
    }



}
