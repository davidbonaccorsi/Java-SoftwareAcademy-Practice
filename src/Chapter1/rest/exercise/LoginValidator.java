package rest.exercise;

public class LoginValidator {
     public static void main(String[] args) {
         String username = "David";
         String password = "12345678";
         int age = 18;

         if (checkLogin(username, password, age)) {
             System.out.println("Login Successful");
         } else {
             System.out.println("Login Failed");
         }



     }

     public static boolean checkLogin(String username, String password, int age) {
         return age >= 18 && username != "" && password.length() >= 8;
     }
}
