package app;


import cart.Cart;
import checkout.CheckoutService;
import customer.Customer;
import product.Product;
import product.factory.ProductFactory;

import java.time.LocalDate;


public class ECommerceApp {
    public static void main(String[] args) {
        System.out.println("=== Test Case: Successful Checkout ===");
        try {
            Customer customer = new Customer("Abdelrhman", 1000);
            Cart cart = new Cart();
            Product cheese = ProductFactory.withExpiryAndShipping("Cheese", 50, 10, LocalDate.now().plusDays(2), 2.5);
            Product tv = ProductFactory.withShippingOnly("TV", 400, 2, 10);
            Product card = ProductFactory.createBaseProduct("Scratch Card", 100, 5);

            cart.addProduct(cheese, 2);
            cart.addProduct(tv, 1);
            cart.addProduct(card, 1);

            CheckoutService checkout = new CheckoutService();
            checkout.checkout(cart, customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Test Case: Insufficient Balance ===");
        try {
            Customer poorCustomer = new Customer("Ahmed", 50);
            Cart cart = new Cart();

            Product expensiveTV = ProductFactory.withShippingOnly("TV", 1000, 1, 10);
            cart.addProduct(expensiveTV, 1);

            CheckoutService checkout = new CheckoutService();
            checkout.checkout(cart, poorCustomer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Test Case: Product Expired ===");
        try {
            Customer customer = new Customer("Sarah", 500);
            Cart cart = new Cart();

            Product expiredCheese = ProductFactory.withExpiryOnly("Cheese", 50, 5, LocalDate.now().minusDays(1));
            cart.addProduct(expiredCheese, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Test Case: Product Out of Stock ===");
        try {
            Customer customer = new Customer("Ali", 500);
            Cart cart = new Cart();

            Product limitedItem = ProductFactory.createBaseProduct("Headphones", 150, 1);
            cart.addProduct(limitedItem, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Test Case: Product Not Shippable ===");
        try {
            Customer customer = new Customer("Zeinab", 500);
            Cart cart = new Cart();

            Product digitalCard = ProductFactory.createBaseProduct("Mobile Scratch Card", 100, 5);
            cart.addProduct(digitalCard, 2);

            CheckoutService checkout = new CheckoutService();
            checkout.checkout(cart, customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}