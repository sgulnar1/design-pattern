package flyweight;

public class Card {
    private int id;
    private String number;
    private CardType cardType;

    public Card(int id, String number, CardType cardType) throws InterruptedException {
        Thread.sleep(100);
        this.id = id;
        this.number = number;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", cardType=" + cardType +
                '}';
    }
}
