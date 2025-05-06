package flyweight;

import java.util.ArrayList;
import java.util.List;

public class CardService {
    List<Card> cards = new ArrayList<Card>();
    public void addCard(Card card) {
        cards.add(card);
    }
    public List<Card> getCards() {
        return cards;
    }
}
