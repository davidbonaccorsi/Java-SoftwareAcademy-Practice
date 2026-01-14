package Chapter6.e7;

public record User(String username, String email, String hashedPassword) {

    public User{
        if(username == null || username.isBlank()){
            throw new IllegalArgumentException("Username cannot be blank");
        } else if(email == null || email.isBlank() || !email.contains("@")){
            throw new IllegalArgumentException("Invalid email");
        }
        System.out.println("User created with username: " + username + " and email: " + email);
    }


}
