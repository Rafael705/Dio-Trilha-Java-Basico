package JavaDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class PizzaRepository {
    private List<String> orders = new ArrayList<>();

    public void saveOrder(String pizza){
        orders.add(pizza);
        System.out.println("Pedido salvo: " + pizza);
    }

    public List<String> getAllOrders() {
        return orders;
    }
}
