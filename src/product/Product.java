package product;

public interface Product {
    String getName();
    double getPrice();
    int getQuantity();
    void reduceQuantity(int amount);
    boolean isExpired();
    boolean isShippable();
    double getWeight();
}