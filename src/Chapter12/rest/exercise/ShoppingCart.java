package rest.exercise;

public class ShoppingCart {

    public static void main (String[] args) {
        System.out.println("Shopping cart is created");

        double price = 150;
        int quantity = 2;
        double discount = 5.75;
        double tax = 0.21;

        double subtotal = Subtotal(price, quantity);

        subtotal = subtotal * (1+discount/100);
        System.out.println("Discounted subtotal: " + subtotal);
        subtotal = subtotal * (1+tax);
        System.out.println("Total price: " + subtotal);


    }

    protected static double Subtotal(double price, int quantity) {
        System.out.println("Subtotal : " + price*quantity);
        return price * quantity;
    }
}

/// TODO: Declare variables
/// - item price (double)
/// - quantity (int)
/// - discount percentage (double)
/// - tax rate (double)
/// TODO: Calculate subtotal
/// TODO: Apply discount
/// TODO: Add tax
/// TODO: Print final price