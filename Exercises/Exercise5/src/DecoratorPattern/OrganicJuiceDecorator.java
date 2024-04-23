package DecoratorPattern;

public class OrganicJuiceDecorator extends JuiceDecorator {
    public OrganicJuiceDecorator(Juice juice) {
        super(juice);
    }

    @Override
    public double cost() {
        return super.cost() + 10;  // Additional cost for being organic
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", organic";
    }
}
