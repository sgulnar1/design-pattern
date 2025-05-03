package builder;

public class Card {
    private Integer id;
    private String name;
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private boolean isVisa;
    private boolean isActive;
    private boolean isNew;

//    public Card() {
//    }

    public Card(Integer id, String cardNumber, String expiryDate, String cvv) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public Card(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Card(Integer id, String name, String cardNumber, String expiryDate, String cvv, boolean isVisa, boolean isActive, boolean isNew) {
        this.id = id;
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.isVisa = isVisa;
        this.isActive = isActive;
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvv='" + cvv + '\'' +
                ", isVisa=" + isVisa +
                ", isActive=" + isActive +
                ", isNew=" + isNew +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean isVisa() {
        return isVisa;
    }

    public void setVisa(boolean visa) {
        isVisa = visa;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
