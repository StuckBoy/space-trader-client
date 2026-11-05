package org.stuckboy.models.ship;

import org.stuckboy.models.trade.TradeSymbol;

public class ShipCargoItem {
    private TradeSymbol symbol;
    private String name;
    private String description;
    private Integer units;

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

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }
}
