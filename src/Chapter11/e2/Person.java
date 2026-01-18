package Chapter11.e2;

public class Person {

    private int age;

    public void setAge(int age){
        if(age < 0 || age > 150){
            throw new InvalidAgeException("Invalid age: " + age + " | Correct age interval: 0 - 150");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
