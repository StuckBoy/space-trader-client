package org.stuckboy.models.trade;

/**
 * A good that can be traded for other goods or currency.
 */
public class TradeGood {
    private TradeSymbol symbol;
    private String name;
    private String description;

    public TradeSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(TradeSymbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
