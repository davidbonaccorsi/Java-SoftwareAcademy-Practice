package Chapter6.e6;

public class PayPal implements PaymentMethod{

    @Override
    public PaymentResult processPayment(double amount, Integer identifier){
        logTransaction("Processing PayPal card payment from " + identifier);
        if(amount > 0){
            logTransaction("Removing money from " + identifier + "'s PayPal account.");
            return PaymentResult.SUCCESS;
        } else {
            logTransaction("Failed to process PayPal payment from " + identifier);
            return PaymentResult.FAILURE;
        }
    }
}
