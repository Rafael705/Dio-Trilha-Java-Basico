package JavaDesignPattern;

public class PercentageDiscount implements DiscountStrategy{
    private double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }
    public double applyDiscount(double price){
        return percent - (price * percent);
    }
}
