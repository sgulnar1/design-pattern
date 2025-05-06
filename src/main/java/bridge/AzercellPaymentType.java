package bridge;

public class AzercellPaymentType extends PaymentType {
    public AzercellPaymentType(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void pay() {
        System.out.println("Kontur odenishidir");
        paymentGateway.processPayment();
    }
}
