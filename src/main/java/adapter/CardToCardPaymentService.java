package adapter;

public class CardToCardPaymentService implements PaymentService {
    @Override
    public void payment(String from, String to, double amount) {
        System.out.println("card to car payment logic...");
    }

    @Override
    public boolean cardValid(String from) {
        return false;
    }

    @Override
    public boolean hasBalance(String from, double amount) {
        return false;
    }
}
