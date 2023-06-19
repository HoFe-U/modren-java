package example.chpter10.stock.builder;

import example.chpter10.stock.Order;
import example.chpter10.stock.Trade;
import java.util.function.Consumer;

/**
 * 람다를 위한 Builder
 *
 * @author : 유호철
 * @since 1.0
 */
public class LambdaOrderBuilder {
    private Order order = new Order();

    public static Order order(Consumer<LambdaOrderBuilder> consumer){
        LambdaOrderBuilder builder = new LambdaOrderBuilder();
        consumer.accept(builder);
        return builder.order;
    }

    public void forCustomer(String customer){
        order.setCustomer(customer);
    }
    public void buy(Consumer<TradeBuilder> consumer){
        trade(consumer, Trade.Type.BUY);
    }
    public void sell(Consumer<TradeBuilder> consumer){
        trade(consumer, Trade.Type.SELL);
    }

    private void trade(Consumer<TradeBuilder> consumer, Trade.Type type){
        TradeBuilder tradeBuilder = new TradeBuilder();
        tradeBuilder.trade.setType(type);
        consumer.accept(tradeBuilder);
        order.addTrade(tradeBuilder.trade);
    }
}
