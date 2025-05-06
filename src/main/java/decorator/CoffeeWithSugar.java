package decorator;

public class CoffeeWithSugar implements CoffeeOrder{
    @Override
    public String getName() {
        return "Kofe, sekerli";
    }
}
