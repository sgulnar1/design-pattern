package prototype;

public class CustomerService {
    public Customer getCustomer(Integer id) throws InterruptedException {
        Thread.sleep(1000);
        return new Customer(id, "Gulnar");
    }
}
