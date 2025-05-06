package decorator;

public class CoffeeDecorator implements CoffeeOrder {
    CoffeeOrder order;

    public CoffeeDecorator(CoffeeOrder order) {
        this.order = order;
    }

    @Override
    public String getName() {
        return order.getName();
    }
}
