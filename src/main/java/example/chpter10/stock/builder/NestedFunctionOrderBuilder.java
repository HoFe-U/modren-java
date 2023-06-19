package example.chpter10.stock.builder;

import example.chpter10.stock.Order;
import example.chpter10.stock.Stock;
import example.chpter10.stock.Trade;
import java.util.stream.Stream;

/**
 * 설명작성란
 *
 * @author : 유호철
 * @see
 * @since 1.0
 */
public class NestedFunctionOrderBuilder {
    public static Order order(String customer, Trade... trades){
        Order order = new Order();
        order.setCustomer(customer);
        Stream.of(trades)
            .forEach(order::addTrade);
        return order;
    }

    public static Trade buy(int quantity, Stock stock, double price){
        return buildTrade(quantity, stock, price,Trade.Type.BUY);
    }

    private static Trade buildTrade(int quantity, Stock stock, double price, Trade.Type type) {
        Trade trade = new Trade();
        trade.setQuantity(quantity);
        trade.setType(type);
        trade.setStock(stock);
        trade.setPrice(price);
        return trade;
    }

    public static double at(double price) {
        return price;
    }

    public static Stock stock(String symbol, String market) {
        Stock stock = new Stock();
        stock.setSymbol(symbol);
        stock.setMarket(market);
        return stock;
    }

    public static String on(String market) {
        return market;
    }
}
