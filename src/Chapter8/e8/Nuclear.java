package Chapter8.e8;

public record Nuclear(String id, double coreTemp) implements PowerSource{
    public Nuclear{
        if (coreTemp > 1000){
            System.out.println("Attention! Temperature higher than 1000!s");
        }
    }
}
