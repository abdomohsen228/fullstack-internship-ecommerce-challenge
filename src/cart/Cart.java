package cart;

import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        if (product.getQuantity() < quantity) {
            throw new IllegalArgumentException("Insufficient quantity for " + product.getName());
        }
        if (product.isExpired()) {
            throw new IllegalArgumentException("Product is expired: " + product.getName());
        }
        items.add(new CartItem(product, quantity));
        product.reduceQuantity(quantity);
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
    public List<CartItem> getItems() {
        return items;
    }
    public double getSubtotal() {
        return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
    }
    public List<Product> getShippableItems() {
        return items.stream()
                .map(CartItem::product)
                .filter(Product::isShippable)
                .toList();
    }
}