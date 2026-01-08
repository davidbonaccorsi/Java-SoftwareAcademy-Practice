package Chapter67.e1;

public class Blueprint {
    public Blueprint(){
        System.out.println("Blueprint no-arg");
    }

    public Blueprint(String type){
        System.out.println("Blueprint: " + type);
    }

    public static void main(String[] args){
        House firstHouse = new House();
        Skyscraper firstSky = new Skyscraper();
    }
}
