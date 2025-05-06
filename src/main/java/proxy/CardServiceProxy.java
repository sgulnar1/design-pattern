package proxy;

public class CardServiceProxy {

    CardService cardService = new CardService();

    public void getCardNumber(Integer id, boolean admin) {
        System.out.println("method before");
        if (admin)
            cardService.getCardNumber(id);

    }
}
