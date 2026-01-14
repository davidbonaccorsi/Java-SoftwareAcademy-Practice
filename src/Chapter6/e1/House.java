package Chapter6.e1;

public class House extends Blueprint{
    public House(){
        this("Wood");
    }

    public House(String material){
        super("Residential "+material);
        System.out.println("House " + material);
    }
}
