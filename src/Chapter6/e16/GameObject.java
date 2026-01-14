package Chapter6.e16;

public abstract class GameObject {

    private final String id;

    static {
        System.out.println("Game Engine Loading...");
    }

    public GameObject(String id){
        this.id = id;
    }

    public String getId() { return id; }
}
