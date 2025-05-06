package bridge;


public class WebAzercellPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Web platformadan olunub");
        System.out.println("Kontur odenishidir");
    }
}
