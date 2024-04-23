package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addDiscountStrategy(new PercentageDiscountStrategy(30));

        cart.addDiscountStrategy(new FreeGiftDiscountStrategy(999, "cute bear"));

        cart.addPrice(100);
        cart.addPrice(200);
        cart.addPrice(300);
        cart.addPrice(400);
        cart.addPrice(500);

        System.out.println("------------------------------------");
        System.out.println("Total price with discounts: " + cart.calculateTotalPrice());
    }
}


