package factory;

public abstract class Product {
   private Integer id;
   private String name;
   public abstract double getPrice();

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

   @Override
   public String toString() {
      return "CategoryInterface{" +
              "id=" + id +
              ", name='" + name + '\'' +
              '}';
   }

   public Product(Integer id, String name) {
      this.id = id;
      this.name = name;
   }

   public Product() {
   }
}
