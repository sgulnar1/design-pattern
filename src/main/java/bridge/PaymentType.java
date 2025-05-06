package bridge;

public abstract class PaymentType extends Payment {
    public PaymentGateway paymentGateway;

    public PaymentType(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
}
