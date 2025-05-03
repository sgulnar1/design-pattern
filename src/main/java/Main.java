import builder.Card;
import builder.CardBuilder;
import factory.*;
import singleton.Category;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //main.singleton();
        main.builder();
    }

    private void builder() {
//        Card card1 = new Card(1, "gold");
//        Card card2 = new Card(2, "silver", "74156221",
//        "014", "08/26",true, false, false );
//        Card card3 = new Card();
//        card3.setId(3);
//        card3.setCardNumber("412563987");
//        Card card4 =new Card();
        Card card1 = CardBuilder.builder(1, "147852369", "04/29", "017").setName("gold").build();
        Card card2 = CardBuilder.builder(2,"74156221", "08/26","014").setName("silver")
            .setVisa(true).setActive(false).setNew(false).build();
        Card card3 = CardBuilder.builder(3, "412563987", "07/31", "456").build();
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }

    private void abstractFactory() {
        ProductAbstractFactory productAbstractFactory = new MobileProductFactory();
    }

    private void factory() {
//        Product product1 = new MobileProduct(1, "android");
//        Product product2 = new NotebookProduct(2, "mac");
        Product product1 = ProductFactory.getProduct(1, "xiomi");
        Product product2 = ProductFactory.getProduct(2, "mac");
        System.out.println("product1: " + product1);
        System.out.println("product 1 price: " + product1.getPrice());
        System.out.println("product2: " + product2);
        System.out.println("product 1 price: " + product2.getPrice());
    }

    private void singleton() {
        Category category1 = Category.getInstance();
        Category category2 = Category.getInstance();
        System.out.println(category1.toString());
        System.out.println(category2.toString());
        //    Category.staticMethod();
    }
}
