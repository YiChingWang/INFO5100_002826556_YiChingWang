package StrategyPattern;

public class FreeGiftDiscountStrategy implements DiscountStrategy {
    private double QualifyingAmount;
    private String freeGift;

    public FreeGiftDiscountStrategy(double QualifyingAmount, String freeGift) {
        this.QualifyingAmount = QualifyingAmount;
        this.freeGift = freeGift;
    }

    @Override
    public double applyDiscount(double amount) {
        if (amount >= QualifyingAmount) {
            System.out.println("Good News! You get a " + freeGift + "!");
            return amount;
        } else {
            return amount;
        }
    }
}

