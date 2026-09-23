package Order;

public class OrderItem {
    private final String productId;
    private final double price;
    private final int quantity;

    public OrderItem(String productId, double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
