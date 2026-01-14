package Chapter6.e12;

public record Person(String name, String email, int age) {
    public Person{
        System.out.println("Person Constructor");
        if(age <= 13){
            throw new IllegalArgumentException("Age must be >= 13");
        }
        if(email.isBlank()){
            throw new IllegalArgumentException("Email cannot be blank");
        } else if(!email.contains("@")){
            throw new IllegalArgumentException("Invalid email");
        }
        name = name.toUpperCase().trim();
    }
}
