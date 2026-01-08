package Chapter67.e4;

public abstract class Employee {
    private String name;
    protected double salary;
    static int totalEmployees;

    static{
        System.out.println("1. Employee Static");
    }

    {
        System.out.println("2. Employee Instance");
    }

    public Employee(String name){
        this(name,50000);
        System.out.println("3. Employee Name Constructor");
    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        System.out.println("4. Employee Main Constructor");
    }

    public abstract Object getBenefits();
}
