package facade;


public class CardToCardTransferService {
    CardService cardService = new CardService();

    public void transfer(String fromCard, String toCard, double amount) {
        if (!cardService.isBlock(fromCard) && !cardService.isBlock(toCard)
                && cardService.isCardValid(fromCard) && cardService.isCardValid(toCard)
                && cardService.hasBalance(fromCard, amount))
            System.out.println("transfer ok");
        else System.out.println("transfer error");
    }
}
