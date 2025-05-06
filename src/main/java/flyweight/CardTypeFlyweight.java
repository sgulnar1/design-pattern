package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CardTypeFlyweight {
    Map<Integer, CardType> cardTypes = new HashMap<Integer, CardType>();
    public CardType addCardType(Integer id, String type) throws InterruptedException {
        if(cardTypes.containsKey(id))
            return cardTypes.get(id);
       return  cardTypes.put(id, new CardType(id, type));
    }
}
