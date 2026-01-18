package Chapter11.e2;

public class TestPerson {

    public static void main(String[] args){
        Person p1 = new Person();

        try{
            p1.setAge(25);
            System.out.println("Age set successfully: " + p1.getAge());
        } catch (InvalidAgeException e){
            System.err.println(e.getMessage());
        }

        try {
            p1.setAge(-5);
        }  catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }




    }
}
