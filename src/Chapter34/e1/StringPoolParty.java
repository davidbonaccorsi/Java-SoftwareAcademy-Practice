package Chapter34.e1;

public class StringPoolParty {
    public static void main(String[] args) {
        String x = "Hello World";
        String y = "Hello World"; // Literal
        String z = " Hello World".trim(); // Method calculation
        String w = new String("Hello World"); // Forced new object

        System.out.println(x == y); // Case 1
        System.out.println(x == z); // Case 2
        System.out.println(x == w); // Case 3
    }
}