package Chapter67.e6;

public interface PaymentMethod {

    PaymentResult processPayment(double amount, Integer identifier);

    default PaymentResult pay(double amount, Integer identifier){
        logTransaction("Starting payment for $" + amount);

        if (amount <= 0 || identifier == null) {
            logTransaction("Invalid request inputs.");
            return PaymentResult.FAILURE;
        }

        PaymentResult result = processPayment(amount, identifier);

        logTransaction("Payment finished with status: " + result);

        return result;
    }

    default void logTransaction(String log){
        System.out.println("Logging the following: " + log);
    }
}
