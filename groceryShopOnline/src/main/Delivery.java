import java.util.Date;

public class Delivery {
    private Date deliveryDate;
    private Supplier supplier;
    private float deliveryPrice;
    Product[] deliveredProducts;
// OK
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public float getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(float deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Product[] getDeliveredProducts() {
        return deliveredProducts;
    }

    public void setDeliveredProducts(Product[] deliveredProducts) {
        this.deliveredProducts = deliveredProducts;
    }
}
