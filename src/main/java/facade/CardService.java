package facade;

public class CardService {
    public boolean isCardValid(String cardNumber) {
        return true;
    }
    public boolean isBlock(String cardNumber) {
        return false;
    }
    public double getCommission(String cardNumber, double amount) {
        return amount*0.01;
    }
    public boolean hasBalance(String cardNumber, double amount) {
        double balance = 100;
        return amount + getCommission(cardNumber, amount)<100;
    }
}
