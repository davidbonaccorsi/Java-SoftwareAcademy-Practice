package Chapter6.e6;

public class BankTransfer implements PaymentMethod{

    @Override
    public PaymentResult processPayment(double amount, Integer identifier){
        logTransaction("Processing BankTransfer payment from " + identifier);
        if(amount > 0){
            System.out.println("Waiting for bank transfer to arrive.");
            logTransaction("Removing money from " + identifier + "'s Bank account.");
            return PaymentResult.SUCCESS;
        } else {
            logTransaction("Failed to process BankTransfer from " + identifier);
            return PaymentResult.FAILURE;
        }
    }
}
