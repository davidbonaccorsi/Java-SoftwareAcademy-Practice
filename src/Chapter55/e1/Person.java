package Chapter55.e1;

public class Person {
    public static void main(String[] args) {
        Person firstPerson = new Person("David", 25, "@s");
        System.out.println(firstPerson.displayInfo());
    }

    private String name;
    private int age;
    private String email;
    static int totalPeople;

    public Person(String name, int age, String email){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        } else if(!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.age = age;
        this.email = email;
        this.name = name;
        totalPeople++;
        System.out.println("Person created");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public static int getTotalPeople() {
        return totalPeople;
    }

    public String displayInfo(){
        return "Name: " + name + ", Age: " + age + ", Email: " + email;
    }
}
