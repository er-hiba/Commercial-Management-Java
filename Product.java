public class Product {
    private static int numProducts = 0;
    private int ref;
    private double purchasePrice;
    private double sellingPrice;
    private int stock;
    private String designation;

    public Product(int ref, double purchasePrice, double sellingPrice, String designation, int stock) {
        this.ref = ref;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.stock = stock;
        this.designation = designation;
        numProducts++;
    }

    public int getRef() {
        return ref;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public int getStock() {
        return stock;
    }

    public String getDesignation() {
        return designation;
    }

    public static int getNumProducts() {
        return numProducts;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return String.format("Product reference: %d\n -Purchase Price: %.2f\n -Selling Price: %.2f\n -Quantity: %d\n -Designation: %s\n",
                ref, purchasePrice, sellingPrice, stock, designation);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product other = (Product) obj;
        return this.ref == other.ref;
    }
}
