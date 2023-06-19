package example.chpter10.stock.builder;

import example.chpter10.stock.Trade;
import java.util.function.Consumer;

/**
 * 설명작성란
 *
 * @author : 유호철
 * @see
 * @since 1.0
 */
public class TradeBuilder {
    private MethodChainingOrderBuilder builder;
    public Trade trade = new Trade();

    public TradeBuilder() {
    }

    public TradeBuilder(MethodChainingOrderBuilder builder,
                        Trade.Type type, int quantity){
        this.builder = builder;
        trade.setType(type);
        trade.setQuantity(quantity);
    }
    public StockBuilder stock(String symbol){
        return new StockBuilder(builder, trade, symbol);
    }
    public void stock(Consumer<StockBuilder> consumer){
        StockBuilder stockBuilder = new StockBuilder();
        consumer.accept(stockBuilder);
        trade.setStock(stockBuilder.getStock());
    }

    public void quantity(int quantity){
        trade.setQuantity(quantity);
    }

    public void price(double price){
        trade.setPrice(price);
    }
}
