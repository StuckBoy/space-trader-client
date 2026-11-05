package org.stuckboy.models.ship;

public class ShipModificationTransaction {
    private String waypointSymbol;
    private String shipSymbol;
    private String tradeSymbol;
    private Integer totalPrice;
    private String timestamp;

    public String getWaypointSymbol() {
        return waypointSymbol;
    }

    public void setWaypointSymbol(String waypointSymbol) {
        this.waypointSymbol = waypointSymbol;
    }

    public String getShipSymbol() {
        return shipSymbol;
    }

    public void setShipSymbol(String shipSymbol) {
        this.shipSymbol = shipSymbol;
    }

    public String getTradeSymbol() {
        return tradeSymbol;
    }

    public void setTradeSymbol(String tradeSymbol) {
        this.tradeSymbol = tradeSymbol;
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
