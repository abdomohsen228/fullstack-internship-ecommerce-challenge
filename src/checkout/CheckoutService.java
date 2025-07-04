package checkout;

import cart.Cart;
import customer.Customer;
import shipping.ShippingService;

public class CheckoutService {
    private final ShippingService shippingService = new ShippingService();

    public void checkout(Cart cart, Customer customer) {
        if (cart.isEmpty()) {
            throw new IllegalStateException("Cart is empty");
        }
        double subtotal = cart.getSubtotal();
        double shipping = shippingService.calculateShipping(cart.getShippableItems());
        double total = subtotal + shipping;

        if (customer.getBalance() < total) {
            throw new IllegalStateException("Customer balance is insufficient");
        }
        customer.deduct(total);
        shippingService.ship(cart.getShippableItems());
        System.out.println("Checkout Complete\n====================");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Shipping: " + shipping);
        System.out.println("Total Paid: " + total);
        System.out.println("Remaining Balance: " + customer.getBalance());
    }
}
