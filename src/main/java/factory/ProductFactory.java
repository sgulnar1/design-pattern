package factory;

public class ProductFactory {
    public static Product getProduct(Integer id, String name) {
        if(name.equalsIgnoreCase("xiomi"))
            return new MobileProduct(id, name);
        else if(name.equalsIgnoreCase("apple"))
            return new MobileProduct(id, name);
        else if(name.equalsIgnoreCase("nokia"))
            return new MobileProduct(id, name);
        else if(name.equalsIgnoreCase("mac"))
            return new NotebookProduct(id, name);
        else if(name.equalsIgnoreCase("hp"))
            return new NotebookProduct(id, name);
        else if(name.equalsIgnoreCase("acer"))
            return new NotebookProduct(id, name);
        else return new Product(id, name) {
                @Override
                public double getPrice() {
                    return 0;
                }
            };
    }
}
