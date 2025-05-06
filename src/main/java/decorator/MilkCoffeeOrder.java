package decorator;

public class MilkCoffeeOrder extends CoffeeDecorator{
    public MilkCoffeeOrder(CoffeeOrder order) {
        super(order);
    }

    @Override
    public String getName() {
        return super.getName() + ", sudlu";
    }
}
