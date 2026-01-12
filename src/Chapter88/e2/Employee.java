package Chapter88.e2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = 50222;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public static void main(String[] args){

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mike", 54));

        Predicate<Employee> olderThan30 = old -> old.getAge() > 30;

        Predicate<Employee> highEarner = rich -> rich.getSalary() > 50000;

        Predicate<Employee> seniorHighEngineer = olderThan30.and(highEarner);

        Consumer<Employee> printName = System.out::println;

        employees.stream().filter(seniorHighEngineer).forEach(printName);
    }

    @Override
    public String toString(){
        return getName();
    }

    public void test1(){
        int x = 10;
        Supplier<Integer> s = () -> x;
    }

    public void test2(){
        int x = 10;
        Supplier<Integer> s = () -> x;
    }

    public void test3(int n){
        Predicate<Integer> p = m -> m>5;
    }

    public void test4(int x){
        Predicate<Integer> p = y -> y > x;
    }

    public void test5(int x){
        Predicate<Integer> p = y -> y > x;
    }



}
