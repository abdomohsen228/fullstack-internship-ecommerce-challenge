package shipping;

import product.Product;

import java.util.List;

public class ShippingService {
    public double calculateShipping(List<Product> shippableItems) {
        double totalWeight = shippableItems.stream().mapToDouble(Product::getWeight).sum();
        return totalWeight * 10; // 10 is the assumption shipping cost
    }
    public void ship(List<Product> shippableItems) {
        System.out.println("Shipping these items:");
        shippableItems.forEach(p -> System.out.println("- " + p.getName() + " | " + p.getWeight() + " kg"));
    }
}