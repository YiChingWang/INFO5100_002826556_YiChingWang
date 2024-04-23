package StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> prices;
    private List<DiscountStrategy> discountStrategies;

    public ShoppingCart() {
        prices = new ArrayList<>();
        discountStrategies = new ArrayList<>();
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void addDiscountStrategy(DiscountStrategy discountStrategy) {
        discountStrategies.add(discountStrategy);
    }

    public double calculateTotalPrice() {
        double totalPrice = prices.stream().mapToDouble(Double::doubleValue).sum();
        for (DiscountStrategy strategy : discountStrategies) {
            totalPrice = strategy.applyDiscount(totalPrice);
        }
        return totalPrice;
    }
}

