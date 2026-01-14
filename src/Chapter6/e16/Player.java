package Chapter6.e16;

public class Player extends Character{

    int level;

    {
        System.out.println("Player data initializing");
    }

    public Player(String name, int level){
        super(name);
        this.level = level;
    }

    public Player(String name){
        this(name,1);
    }

    public static void main(String[] args) {
        Renderable obj = new Player("John");
    }


}
