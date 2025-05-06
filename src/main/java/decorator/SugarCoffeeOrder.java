package decorator;

public class SugarCoffeeOrder extends CoffeeDecorator{
    public SugarCoffeeOrder(CoffeeOrder order) {
        super(order);
    }

    @Override
    public String getName() {
        return super.getName() + ", shekerli";
    }
}
