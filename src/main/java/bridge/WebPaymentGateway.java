package bridge;

public class WebPaymentGateway implements PaymentGateway{
    @Override
    public void processPayment() {
        System.out.println("Web platformadan olunub");
    }
}
