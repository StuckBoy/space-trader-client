package org.stuckboy.models;

import org.stuckboy.models.trade.TradeSymbol;

public class Extraction {

    public static class Yield {
        private TradeSymbol symbol;

        public TradeSymbol getSymbol() {
            return symbol;
        }

        public void setSymbol(TradeSymbol symbol) {
            this.symbol = symbol;
        }
    }

    private String shipSymbol;
    private Yield yield;

    public String getShipSymbol() {
        return shipSymbol;
    }

    public void setShipSymbol(String shipSymbol) {
        this.shipSymbol = shipSymbol;
    }

    public Yield getYield() {
        return yield;
    }

    public void setYield(Yield yield) {
        this.yield = yield;
    }
}
