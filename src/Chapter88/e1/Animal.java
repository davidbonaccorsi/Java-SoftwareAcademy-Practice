package Chapter88.e1;

public class Animal {
    private boolean canHop;
    private boolean canSwim;
    private String name;

    public Animal(String name, boolean canHop, boolean canSwim){
        this.name = name;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop(){
        return this.canHop;
    }

    public boolean canSwim(){
        return this.canSwim;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
