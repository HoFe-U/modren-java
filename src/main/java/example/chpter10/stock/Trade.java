package example.chpter10.stock;

/**
 * 설명작성란
 *
 * @author : 유호철
 * @since 1.0
 */
public class Trade {
    private Type type;
    private Stock stock;
    private int quantity;
    private double price;

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getValue() {
        return this.quantity * price;
    }

    public enum Type {BUY, SELL}
}
