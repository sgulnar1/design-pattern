package singleton;

public class Category {
    private Integer id;
    private String name;
    private Product product;
    private static Category category;

    public static void staticMethod() {
        System.out.println("static method...");
    }

    private Category() {
        System.out.println("category constructor");
    }

    public static Category getInstance() {
        System.out.println("category getInstance");
        if (category == null) {
            synchronized (Category.class) {
                if (category == null)
                    category = new Category();
            }
        }
        return category;
    }
//    @Override
//    public String toString() {
//        return "Category{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", product=" + product +
//                '}';
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
