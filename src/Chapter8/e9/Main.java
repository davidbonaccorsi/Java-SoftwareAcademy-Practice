package Chapter8.e9;

public class Main {

    public static void main(String[] args){

        Repository<Employee> rep = new Repository<>();
        rep.save(new Employee("Angelo",21, "Marketing", 10.000));
        rep.save(new Employee("Jack",23, "IT", 15.000));
        rep.save(new Employee("Paul",31, "IT", 35.000));

        rep.updateAll(
                employee ->  employee.Department().equals("IT"),
                employee -> new Employee(
                        employee.name(),
                        employee.age(),
                        employee.Department(),
                        employee.salary()+5000
                )
        );

        System.out.println(rep.map(Employee::name));
    }
}
