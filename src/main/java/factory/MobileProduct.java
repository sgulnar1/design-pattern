package factory;

public class MobileProduct extends Product {
    @Override
    public double getPrice() {
        return 2000;
    }

    public MobileProduct(Integer id, String name) {
        super(id, name);
    }

    public MobileProduct() {
    }
}
