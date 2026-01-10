package Chapter67.e6;

public enum PaymentResult {
    SUCCESS("Payment succesful."), FAILURE("Payment failed");

    final private String message;

    PaymentResult(String message){
        this.message = message;
    }

    @Override
    public String toString(){
        return message;
    }
}
