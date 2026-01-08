package Chapter67.e2;

public class VideoCard extends DeviceDriver{

    static{
        System.out.println("6. Video Static");
    }

    public VideoCard(){
        this("Generic Video");
    }

    public VideoCard(String name){
        super(name);
        System.out.println("7. Video constructor");
    }

    @Override
    public String runDiagnotics(){
        return "Video OK";
    }



}
