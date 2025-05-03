package builder;

public class CardBuilder {
    private Integer id;
    private String name;
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private boolean isVisa;
    private boolean isActive;
    private boolean isNew;

    public CardBuilder(Integer id, String cardNumber, String expiryDate, String cvv) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public static CardBuilder builder(Integer id, String cardNumber, String expiryDate, String cvv) {
        CardBuilder cardBuilder = new CardBuilder(id, cardNumber, expiryDate, cvv);
        return cardBuilder;
    }

//    public CardBuilder setId(Integer id) {
//        this.id = id;
//        return this;
//    }

    public CardBuilder setName(String name) {
        this.name = name;
        return this;
    }
//
//    public CardBuilder setCardNumber(String cardNumber) {
//        this.cardNumber = cardNumber;
//        return this;
//    }
//
//    public CardBuilder setExpiryDate(String expiryDate) {
//        this.expiryDate = expiryDate;
//        return this;
//    }
//
//    public CardBuilder setCvv(String cvv) {
//        this.cvv = cvv;
//        return this;
//    }

    public CardBuilder setVisa(boolean visa) {
        isVisa = visa;
        return this;
    }

    public CardBuilder setActive(boolean active) {
        isActive = active;
        return this;
    }

    public CardBuilder setNew(boolean aNew) {
        isNew = aNew;
        return this;
    }
    public Card build() {
        Card card = new Card(id, cardNumber, expiryDate, cvv);
        card.setName(name);
        card.setVisa(isVisa);
        card.setActive(isActive);
        card.setNew(isNew);
        return card;
    }
}
