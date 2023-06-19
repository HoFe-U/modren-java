package example.chpter10.stock;

import example.chpter10.stock.builder.MethodChainingOrderBuilder;
import example.chpter10.stock.builder.NestedFunctionOrderBuilder;

/**
 * 설명작성란
 *
 * @author : 유호철
 * @see
 * @since 1.0
 */
public class StockMain {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCustomer("BigBank");

        Trade trade = new Trade();
        trade.setType(Trade.Type.BUY);

        Stock stock = new Stock();
        stock.setMarket("IBM");
        stock.setSymbol("NYSE");

        trade.setStock(stock);
        trade.setPrice(125.00);
        trade.setQuantity(80);

        order.addTrade(trade);

        MethodChainingOrderBuilder.forCustomer("BigBank")
            .buy(80)
            .stock("IBM")
            .on("NYSE")
            .at(125.00)
            .sell(50)
            .stock("GOOGLE")
            .on("NASDAQ")
            .at(375.00)
            .end();

        // 중첩된 함수의 사용
        NestedFunctionOrderBuilder.order("BigBank",
            NestedFunctionOrderBuilder.buy(80,
                NestedFunctionOrderBuilder.stock("IBM",
                    NestedFunctionOrderBuilder.on("NYSE")),
                NestedFunctionOrderBuilder.at(125.00)));

        // 람다 표현식을 이요한 함수 시퀀싱

    }
}
