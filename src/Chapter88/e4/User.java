package Chapter88.e4;

import java.util.function.Predicate;

public record User(String username, String email, int age) {

    static Predicate<User> hasEmail(){
        return a -> a.email.contains("@");
    }

    static Predicate<User> isAdult(){
        return a -> a.age > 18;
    }

    static Predicate<User> isValidName(){
        return a -> !a.username.isBlank();
    }

    public static boolean checkAccess(User u){
         return User.hasEmail()
                 .and(isAdult())
                 .and(isValidName().or(n -> n.username.equals("Admin")))
                 .test(u);
    }
}
