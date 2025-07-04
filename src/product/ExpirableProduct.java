package product;

import java.time.LocalDate;

public class ExpirableProduct extends ProductDecorator {
    private final LocalDate expiryDate;

    public ExpirableProduct(Product product, LocalDate expiryDate) {
        super(product);
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }

    @Override
    public boolean isShippable() {
        return product.isShippable();
    }

    @Override
    public double getWeight() {
        return product.getWeight();
    }
}