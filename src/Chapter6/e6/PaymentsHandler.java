package Chapter6.e6;

public class PaymentsHandler {

    public static void main(String[] args){
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod paypal = new PayPal();

        creditCard.pay(1050,100);
        paypal.pay(1050,100);
        System.out.println("--- END ---");
    }
}
