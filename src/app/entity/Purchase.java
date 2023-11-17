package app.entity;

public class Purchase {

    private final String productName;
    private final int quantity;
    private final double price;

    public Purchase(String productName, int quantity, double price) {

        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
