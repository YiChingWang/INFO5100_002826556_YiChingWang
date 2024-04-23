package DecoratorPattern;

public class SimpleJuice implements Juice {
    @Override
    public double cost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Simple juice";
    }
}
