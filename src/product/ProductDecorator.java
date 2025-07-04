package product;

public abstract class ProductDecorator implements Product {
    protected final Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String getName() { return product.getName(); }

    @Override
    public double getPrice() { return product.getPrice(); }

    @Override
    public int getQuantity() { return product.getQuantity(); }

    @Override
    public void reduceQuantity(int amount) { product.reduceQuantity(amount); }
}