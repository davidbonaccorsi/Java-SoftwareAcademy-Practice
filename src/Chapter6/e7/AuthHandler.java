package Chapter6.e7;

public class AuthHandler{

    public static void main(String[] args){
        AuthService service = new AuthService();
        User firstUser = new User("Marius", "marius@net.com", "1234");

        System.out.println("--- Attempt 1 (Wrong Password) ---");
        AuthResult result1 = service.authenticate(firstUser, "wrongPass");
        handleAuthResult(result1);

        System.out.println("\n--- Attempt 2 (Correct Password) ---");
        AuthResult result2 = service.authenticate(firstUser, "1234");
        handleAuthResult(result2);
    }

    private static void handleAuthResult(AuthResult result){
        String message = switch(result){
            case Success(var user, var token) -> "Welcome " + user.username() + "auth token: " + token + ".";
            case Failure(var error) -> "Error " + error;
            case Locked(var minutes) -> "Account locked for " + minutes + " minutes";
        };
        System.out.println(message);
    }
}
