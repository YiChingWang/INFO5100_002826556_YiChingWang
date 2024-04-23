package DecoratorPattern;

public class MilkJuiceDecorator extends JuiceDecorator {
    public MilkJuiceDecorator(Juice juice) {
        super(juice);
    }

    @Override
    public double cost() {
        return super.cost() + 5;  // Additional cost for milk
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }
}
