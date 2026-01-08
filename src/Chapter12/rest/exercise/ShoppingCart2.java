package rest.exercise;

public class ShoppingCart2 {
    public static void main(String[] args) {
        int quantity = 4;
        double price = 10.50;
        int discount = 1;

        // -------------------------------------------------
        // ERROR 1: We want to double the quantity.
        // Why does this line fail compilation? Fix it.
        quantity = quantity * 2;
        // -------------------------------------------------


        // -------------------------------------------------
        // ERROR 2: We want to subtract the discount from the price.
        // Why does this fail? Fix it by casting.
        double finalPrice = price - discount;
        System.out.println("Total price: " + finalPrice);
        // -------------------------------------------------


        // -------------------------------------------------
        // LOGIC PUZZLE (No Error, just tricky):
        // We check stock. If quantity > 5, print "In Stock: " + quantity.
        // Else print "Low Stock".
        // LOOK CLOSELY at the concatenation and the boolean check.
        String status = "Status: " + (quantity > 5 ? "In Stock: " + quantity : "Low Stock");
        // -------------------------------------------------


        // -------------------------------------------------
        // ERROR 3: Compound Assignment vs Regular Assignment
        // We want to add tax (2.5) to the finalPrice.
        // One of these lines works, the other fails.
        // COMMENT OUT the failing line. Explain (to yourself) why.
        finalPrice += 2.5;         // Line A
        System.out.println("Final price: " + finalPrice);
        finalPrice = finalPrice + 2.5; // Line B
        System.out.println("Final price: " + finalPrice);
        // -------------------------------------------------

        // -------------------------------------------------
        // FINAL OUTPUT PREDICTION
        // Be careful with the String concatenation order here!
        System.out.println(status + " | Total: " + finalPrice + discount);
    }
}