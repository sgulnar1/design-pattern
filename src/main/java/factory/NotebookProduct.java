package factory;

public class NotebookProduct extends Product {
    @Override
    public double getPrice() {
        return 3000;
    }

    public NotebookProduct(Integer id, String name) {
        super(id, name);
    }

    public NotebookProduct() {
    }
}
