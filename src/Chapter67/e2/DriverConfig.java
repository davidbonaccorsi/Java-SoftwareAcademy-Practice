package Chapter67.e2;

public final class DriverConfig {
    private final String name;
    private final int version;

    public DriverConfig(String name, int version){
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    public static void main(String[] args){
        System.out.println(new VideoCard().runDiagnotics());
    }
}
