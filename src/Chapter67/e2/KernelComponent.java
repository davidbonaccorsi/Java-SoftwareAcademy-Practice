package Chapter67.e2;

public abstract class KernelComponent {
    private String name;

    static {
        System.out.println("1. Kernel Static");
    }

    {
        System.out.println("2. Kernel Instance");
    }

    public KernelComponent(String name) {
        this.name = name;
        System.out.println("3. Kernel Constructor: " + name);
    }

    public abstract Object runDiagnotics() throws Exception;

}
