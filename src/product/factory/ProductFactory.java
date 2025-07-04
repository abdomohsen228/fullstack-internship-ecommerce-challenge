package product.factory;

import product.BaseProduct;

import product.ExpirableProduct;
import product.Product;
import product.ShippableProduct;

import java.time.LocalDate;

public class ProductFactory {
    public static Product createBaseProduct(String name, double price, int quantity) {
        return new BaseProduct(name, price, quantity);
    }

    public static Product withExpiry(Product product, LocalDate expiryDate) {
        return new ExpirableProduct(product, expiryDate);
    }

    public static Product withShipping(Product product, double weight) {
        return new ShippableProduct(product, weight);
    }

    public static Product withExpiryAndShipping(String name, double price, int quantity, LocalDate expiryDate, double weight) {
        return withExpiry(withShipping(new BaseProduct(name, price, quantity), weight), expiryDate);
    }

    public static Product withShippingOnly(String name, double price, int quantity, double weight) {
        return withShipping(new BaseProduct(name, price, quantity), weight);
    }

    public static Product withExpiryOnly(String name, double price, int quantity, LocalDate expiryDate) {
        return withExpiry(new BaseProduct(name, price, quantity), expiryDate);
    }
}