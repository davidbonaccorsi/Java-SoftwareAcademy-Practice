package Chapter67.e16;

public interface Renderable {

    default void render(){
        System.out.println("Rendering...");
    }
}
