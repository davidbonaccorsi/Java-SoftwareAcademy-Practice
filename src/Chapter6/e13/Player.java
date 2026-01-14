package Chapter6.e13;

public class Player extends GameEntity{

    {
        System.out.println("[Instance] Player HP assigned");
    }

    protected Player(String name){
        super();
        System.out.println("[Constructor] Player created" + name);
    }
}
