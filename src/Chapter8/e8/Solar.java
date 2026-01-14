package Chapter8.e8;

public record Solar(String id, double sunIntensity) implements PowerSource{
    public Solar{
        if(sunIntensity<0.0 || sunIntensity > 1.0){
            try {
                throw new Exception("Sun intensity incorect (0.0 - 1.0 allowed)");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
