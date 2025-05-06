package abstract_factory;

import factory.MobileProduct;
import factory.Product;

public class MobileProductFactory implements ProductAbstractFactory {
    @Override
    public Product getProduct(Integer id, String name) {
        if(name.equalsIgnoreCase("xiomi"))
            return new MobileProduct(id, name);
        else if(name.equalsIgnoreCase("apple"))
            return new MobileProduct(id, name);
        else if(name.equalsIgnoreCase("nokia"))
            return new MobileProduct(id, name);
        return null;
    }
}
