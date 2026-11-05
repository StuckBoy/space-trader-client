package org.stuckboy.models.trade.market;

public class MarketTransaction {

    public enum TransactionType {
        PURCHASE,
        SELL
    }

    private String waypointSymbol;
    private String shipSymbol;
    private String tradeSymbol;
    private TransactionType type;
    private Integer units;
    private Integer pricePerUnit;
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

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Integer getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Integer pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
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
