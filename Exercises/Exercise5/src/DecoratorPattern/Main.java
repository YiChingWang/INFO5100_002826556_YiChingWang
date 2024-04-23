package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Juice myJuice = new SimpleJuice();
        myJuice = new MilkJuiceDecorator(myJuice);
        myJuice = new OrganicJuiceDecorator(myJuice);

        System.out.println("Juice Description: " + myJuice.getDescription());
        System.out.println("Cost: $" + myJuice.cost());
    }
}
