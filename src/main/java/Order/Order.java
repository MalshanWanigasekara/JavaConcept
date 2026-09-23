package Order;

import java.util.List;

public class Order {
    private final String orderId;
    private final List<OrderItem> items;
    private String status;

    public Order(String orderId, List<OrderItem> items) {
        this.orderId = orderId;
        this.items = items;
        this.status = "CREATED";
    }

    public String getOrderId() {
        return orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}