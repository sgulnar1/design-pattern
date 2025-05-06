package bridge;

public class CreditPaymentType extends PaymentType {
    public CreditPaymentType(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }


    @Override
    public void pay() {
        System.out.println("Kredit odenishidir");
        paymentGateway.processPayment();
    }
}
