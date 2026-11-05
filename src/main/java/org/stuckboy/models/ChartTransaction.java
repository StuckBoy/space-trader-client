package org.stuckboy.models;

import org.stuckboy.models.waypoint.WaypointSymbol;

public class ChartTransaction {
    private WaypointSymbol symbol;
    private String shipSymbol;
    private Integer totalPrice;
    private String timestamp;

    public WaypointSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(WaypointSymbol symbol) {
        this.symbol = symbol;
    }

    public String getShipSymbol() {
        return shipSymbol;
    }

    public void setShipSymbol(String shipSymbol) {
        this.shipSymbol = shipSymbol;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
