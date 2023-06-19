package example.chpter10.stock.builder;

import example.chpter10.stock.Stock;
import example.chpter10.stock.Trade;

/**
 * 설명작성란
 *
 * @author : 유호철
 * @see
 * @since 1.0
 */
public class StockBuilder {
    private MethodChainingOrderBuilder builder;
    private Trade trade;
    private Stock stock = new Stock();

    public StockBuilder() {

    }
    public void symbol(String symbol){
        stock.setSymbol(symbol);
    }

    public void market(String market){
        stock.setMarket(market);
    }

    public Stock getStock() {
        return stock;
    }

    public StockBuilder(MethodChainingOrderBuilder builder, Trade trade, String symbol) {
        this.builder = builder;
        this.trade = trade;
        this.stock.setSymbol(symbol);
    }

    public TradeBuilderWithStock on(String market) {
        stock.setMarket(market);
        trade.setStock(stock);
        return new TradeBuilderWithStock(builder, trade);
    }
}
