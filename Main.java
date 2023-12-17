import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(12345, 200.0, 250.0, "Gaming Laptop", 10);
        Product p2 = new Product(54321, 200.0, 210.0, "Smartphone", 20);

        Order o1 = new Order(LocalDate.of(2023, 12, 10), p1, 150);
        Order o2 = new Order(LocalDate.of(2023, 12, 10), p1, 150);
        Order o3 = new Order(LocalDate.of(2023, 2, 12), p2, 200);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("The number of products is " + Product.getNumProducts() + "\n");

        System.out.println("Product 1 reference = Product 2 reference: " + (p1.equals(p2)) + "\n");

        System.out.println(o1);
        System.out.println(o3);

        System.out.println("Order 1 = Order 2: " + (o1.equals(o3)) + "\n");
    }
}
