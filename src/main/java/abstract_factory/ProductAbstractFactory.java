package abstract_factory;

import factory.Product;

public interface ProductAbstractFactory {
   public Product getProduct(Integer id, String name);
}
