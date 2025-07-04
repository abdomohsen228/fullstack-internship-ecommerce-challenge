package cart;

import product.Product;

public record CartItem(Product product, int quantity) {

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}
