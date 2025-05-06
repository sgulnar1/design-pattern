package flyweight;

public class CardType {
    private Integer id;
    private String name;

    public CardType(Integer id, String name) throws InterruptedException {
        Thread.sleep(100);
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CardType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
