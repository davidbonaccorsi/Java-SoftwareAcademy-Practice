package Chapter6.e6;

public class CreditCard implements PaymentMethod{

    @Override
    public PaymentResult processPayment(double amount, Integer identifier){
        logTransaction("Processing credit card payment from " + identifier);
        if(amount > 0){
            logTransaction("Removing money from " + identifier + "'s card.");
            return PaymentResult.SUCCESS;
        } else {
            logTransaction("Failed to process credit card payment from " + identifier);
            return PaymentResult.FAILURE;
        }
    }
}
