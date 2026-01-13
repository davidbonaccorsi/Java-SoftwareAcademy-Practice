package Chapter88.e8;

public record Nuclear(String id, double coreTemp) implements PowerSource{
    public Nuclear{
        if (coreTemp > 1000){
            try {
                throw new Exception("Temperature higher than 1000 ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
