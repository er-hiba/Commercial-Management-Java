import java.time.LocalDate;

public class Order {
    private LocalDate date;
    private Product product;
    private int quantity;

    public Order(LocalDate date, Product product, int quantity) {
        this.date = date;
        this.product = new Product(product.getRef(), product.getPurchasePrice(), product.getSellingPrice(), product.getDesignation(), product.getStock());
        this.quantity = quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setProduct(Product product) {
        this.product = new Product(product.getRef(), product.getPurchasePrice(), product.getSellingPrice(), product.getDesignation(), product.getStock());
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Order created on %s\n -Product: %s -Quantity: %d\n", date.toString(), product.toString(), quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Order order = (Order) obj;
        return date.equals(order.date) && product.equals(order.product) && quantity == order.quantity;
    }
}
