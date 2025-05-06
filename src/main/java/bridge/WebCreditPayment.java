package bridge;


public class WebCreditPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Web platformadan olunub");
        System.out.println("Kredit odenishidir");
    }
}
