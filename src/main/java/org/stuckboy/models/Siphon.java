package org.stuckboy.models;

public class Siphon {
    private String shipSymbol;
    private SiphonYield yield;

    public String getShipSymbol() {
        return shipSymbol;
    }

    public void setShipSymbol(String shipSymbol) {
        this.shipSymbol = shipSymbol;
    }

    public SiphonYield getYield() {
        return yield;
    }

    public void setYield(SiphonYield yield) {
        this.yield = yield;
    }
}
