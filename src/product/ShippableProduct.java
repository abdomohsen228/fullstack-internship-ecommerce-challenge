package product;

public class ShippableProduct extends ProductDecorator {
    private final double weight;

    public ShippableProduct(Product product, double weight) {
        super(product);
        this.weight = weight;
    }

    @Override
    public boolean isShippable() {
        return true;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean isExpired() {
        return product.isExpired();
    }
}