package JavaDesignPattern;

public class PizzaOrderFacade {
    private PizzaRepository repository = new PizzaRepository();
    private DiscountStrategy discountStrategy;
    private DatabaseConnection connection;

    public PizzaOrderFacade(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
        this.connection = DatabaseConnection.getInstance();
    }

    public void orderPizza(String pizzaName, double price) {
        connection.connect();
        double finalPrice = discountStrategy.applyDiscount(price);
        System.out.println("Pedido: " + pizzaName + " | Preço final: R$" + finalPrice);
        repository.saveOrder(pizzaName);
    }
}

