package adapter;

public interface PaymentService {
     void payment(String from, String to, double amount);
     boolean cardValid(String from);
     boolean hasBalance(String from, double amount);
}
