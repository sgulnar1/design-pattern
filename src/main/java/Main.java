import abstract_factory.MobileProductFactory;
import abstract_factory.NotebookProductFactory;
import abstract_factory.ProductAbstractFactory;
import adapter.AzercellPaymentAdapter;
import adapter.CardToCardPaymentService;
import adapter.PaymentService;
import bridge.AzercellPaymentType;
import bridge.Payment;
import bridge.WebAzercellPayment;
import bridge.WebPaymentGateway;
import builder.Card;
import builder.CardBuilder;
import composite.Devoloper;
import composite.Director;
import composite.TeamLead;
import decorator.*;
import facade.CardToCardTransferService;
import factory.*;
import flyweight.CardService;
import flyweight.CardType;
import flyweight.CardTypeFlyweight;
import prototype.Customer;
import prototype.CustomerService;
import proxy.CardServiceProxy;
import singleton.Category;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Main main = new Main();
        //main.singleton();
        //main.builder();
        main.bridge();

    }

    private void bridge() {
        Payment payment = new AzercellPaymentType(new WebPaymentGateway());
        payment.pay();
    }

    private void decorator() {
        //CoffeeOrder coffeeOrder = new CoffeeWithSugar();
        CoffeeDecorator coffeeDecorator = new SugarCoffeeOrder(new MilkCoffeeOrder(new SimpleCoffeeOrder()));
        System.out.println(coffeeDecorator.getName());
    }

    private void facade() {
        CardToCardTransferService cardToCardTransferService = new CardToCardTransferService();
        cardToCardTransferService.transfer("56612626", "546415", 99);
    }

    private void flyweight() throws InterruptedException {
        CardService cardService = new CardService();
        CardTypeFlyweight cardTypeFlyweight = new CardTypeFlyweight();
        System.out.println("startDate: " + new Date());
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0)
                cardService.addCard(new flyweight.Card(i, "2462322" + i, cardTypeFlyweight.addCardType(1, "VISA")));
            cardService.addCard(new flyweight.Card(i, "2462322" + i, cardTypeFlyweight.addCardType(2, "MASTER")));
        }
        System.out.println("endDate: " + new Date());
    }

    private void proxy() {
        CardServiceProxy cardService = new CardServiceProxy();
        cardService.getCardNumber(1, false);
    }

    private void composite() {
        Director director = new Director(1, "Murad",
                List.of(new Devoloper(1, "Rizvan"), new Devoloper(2, "Seymur"),
                        new TeamLead(4, "Ayxan", List.of(new Devoloper(5, "Elnare"), new Devoloper(6, "Lale")))));
        director.printName();
    }

    private void adapter() {
        PaymentService paymentService = new CardToCardPaymentService();
        paymentService.payment("4125893", "852333", 100);
        PaymentService azerCellPayment = new AzercellPaymentAdapter();
        azerCellPayment.payment("4125893", "852333", 100);
    }

    private void prototype() throws InterruptedException, CloneNotSupportedException {
        System.out.println("startDate: " + new Date());
//        for(int i=1; i<=3;i++) {
//            CustomerService customerService = new CustomerService();
//            customerService.getCustomer(i);
//        }
        CustomerService customerService = new CustomerService();
        Customer customer1 = customerService.getCustomer(1);
        Customer customer2 = customer1.clone();
        customer2.setId(2);
        Customer customer3 = customer1.clone();
        customer3.setId(3);
        System.out.println("endDate: " + new Date());
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
        Card card2 = CardBuilder.builder(2, "74156221", "08/26", "014").setName("silver")
                .setVisa(true).setActive(false).setNew(false).build();
        Card card3 = CardBuilder.builder(3, "412563987", "07/31", "456").build();
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }

    private void abstractFactory() {
        ProductAbstractFactory mobileAbstractFactory = new MobileProductFactory();
        Product product1 = mobileAbstractFactory.getProduct(1, "xiomi");
        ProductAbstractFactory notebookAbstractFactory = new NotebookProductFactory();
        Product product2 = notebookAbstractFactory.getProduct(2, "hp");
        System.out.println("product1: " + product1);
        System.out.println("product 1 price: " + product1.getPrice());
        System.out.println("product2: " + product2);
        System.out.println("product 1 price: " + product2.getPrice());

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
