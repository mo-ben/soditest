package fr.sodifrance.invoice;

/**
 * Created by mbe on 12/06/17.
 */
public class OrderItem {

    private int quantity;

    private IProduct product;

    public OrderItem(int quantity, IProduct product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public IProduct getProduct() {
        return product;
    }
}
