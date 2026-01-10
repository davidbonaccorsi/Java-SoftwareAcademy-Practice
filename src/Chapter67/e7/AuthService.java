package Chapter67.e7;

public class AuthService {

    public AuthResult authenticate(User user, String password){

        if (user.username().equals("Hacker")){
            return new Locked(30);
        }

        if (user.hashedPassword().equals(password)){
            String token = "TOKEN-" + System.currentTimeMillis();
            return new Success(user, token);
        } else {
            return new Failure("Invalid password");
        }
    }
}
