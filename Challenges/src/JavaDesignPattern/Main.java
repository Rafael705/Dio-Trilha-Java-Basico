package JavaDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Estratégia: 10% de desconto
        DiscountStrategy discount = new PercentageDiscount(0.10);

        PizzaOrderFacade orderSystem = new PizzaOrderFacade(discount);
        orderSystem.orderPizza("Calabresa", 40.0);
        orderSystem.orderPizza("Portuguesa", 45.0);

        // Mudando para sem desconto (dinamicamente)
        orderSystem = new PizzaOrderFacade(new NoDiscount());
        orderSystem.orderPizza("Quatro Queijos", 50.0);
    }
}

