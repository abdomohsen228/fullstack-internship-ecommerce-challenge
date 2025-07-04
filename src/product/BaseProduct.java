package product;

public class BaseProduct implements Product {
    private final String name;
    private final double price;
    private int quantity;

    public BaseProduct(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() { return name; }

    @Override
    public double getPrice() { return price; }

    @Override
    public int getQuantity() { return quantity; }

    @Override
    public void reduceQuantity(int amount) { this.quantity -= amount; }

    @Override
    public boolean isExpired() { return false; }

    @Override
    public boolean isShippable() { return false; }

    @Override
    public double getWeight() { return 0.0; }
}
