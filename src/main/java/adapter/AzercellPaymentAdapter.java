package adapter;

public class AzercellPaymentAdapter implements PaymentService {
    AzercellPayment azercellPayment = new AzercellPayment();

    @Override
    public void payment(String from, String to, double amount) {
        System.out.println("azercell payment logic...");
        azercellPayment.makeTransaction(from, amount);
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
