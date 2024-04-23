package DecoratorPattern;

public abstract class JuiceDecorator implements Juice {
    protected Juice decoratedJuice;

    public JuiceDecorator(Juice juice) {
        this.decoratedJuice = juice;
    }

    @Override
    public double cost() {
        return decoratedJuice.cost();
    }

    @Override
    public String getDescription() {
        return decoratedJuice.getDescription();
    }
}
