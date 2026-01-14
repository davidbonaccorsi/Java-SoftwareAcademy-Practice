package Chapter6.e13;

public abstract class GameEntity {

    static{
        System.out.println("[Static] GameEntity loaded");
    }

    {
        System.out.println("[Instance] GameEntity ID assigned");
    }

    public GameEntity(){
        System.out.println("[Constructor] GameEntity created");
    }

}
