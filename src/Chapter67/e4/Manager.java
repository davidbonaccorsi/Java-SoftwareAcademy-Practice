package Chapter67.e4;

public class Manager extends Employee{

    private double bonus;

    static{
        System.out.println("5. Manager Static");
    }

    {
        System.out.println("6. Manager Instance");
    }

    public Manager(String name, double salary, double bonus){
        super(name,salary);
        this.bonus = bonus;
        System.out.println("7. Manager Constructor");
    }

    @Override
    public String getBenefits(){
        return "Health Insurance + Stock Options";
    }

    public String getBenefits(boolean includeBonus){
        if(includeBonus){
            return ("Health + Stocks + Bonus: "+this.bonus);
        } else {
            return this.getBenefits();
        }
    }


}
