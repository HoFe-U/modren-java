package example.chpter10.stock;

/**
 * 설명작성란
 *
 * @author : 유호철
 * @since 1.0
 */
public class Stock {
    private String symbol;
    private String market;

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getMarket() {
        return market;
    }
}
