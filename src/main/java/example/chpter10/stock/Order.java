package example.chpter10.stock;

import java.util.ArrayList;
import java.util.List;

/**
 * 설명작성란
 *
 * @author : 유호철
 * @see
 * @since 1.0
 */
public class Order {
    private String customer;
    private List<Trade> trades = new ArrayList<>();

    public void addTrade(Trade trade){
        trades.add(trade);
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public double getValue(){
        return trades.stream()
            .mapToDouble(Trade::getValue)
            .sum();
    }
}
