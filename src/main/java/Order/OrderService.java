package Order;
import java.util.*;

public class OrderService {

    private final Map<String, Order> orders = new HashMap<>();

    public void addOrder(Order order) {
        orders.put(order.getOrderId(), order);
    }

    public double calculateTotal(String orderId) {
        Order order = orders.get(orderId);

        return order.getItems()
                .stream()
                .filter(item->
                        item.getPrice() != null && item.getPrice()>=0
                )
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
    }

    public void cancelOrder(String orderId) {
        Order order = orders.get(orderId);

        if (!"CREATED".equals(order.getStatus())) {
            throw new IllegalStateException("Order cannot be cancelled");
        }

        order.setStatus("CANCELLED");
    }

    public double calculateTotalPrice(String orderId, double discountPercentage){

        if (30.0 >= discountPercentage && discountPercentage >=0 ) {
            return calculateTotal(orderId) * discountPercentage;
        } else {
            throw new IllegalArgumentException("Incorrect discount percentage");
        }
    }

    public List<Order> getAllOrderWithStatus(String status){

        if (status !=null) {
            return this.orders.values().stream()
                    .filter(order -> status.equals(order.getStatus()))
                    .toList();
        }else {
            throw new IllegalArgumentException();
        }
    }
}