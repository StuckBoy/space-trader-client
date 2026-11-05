package org.stuckboy.models.contract;

import org.stuckboy.models.trade.TradeSymbol;

/**
 * The details of a delivery. Includes the type of good, quantity needed, and
 * where it is going.
 */
public class ContractDeliverGood {
    private TradeSymbol tradeSymbol;
    private String destination;
    private Integer unitsRequired;
    private Integer unitsFulfilled;

    public TradeSymbol getTradeSymbol() {
        return tradeSymbol;
    }

    public void setTradeSymbol(TradeSymbol tradeSymbol) {
        this.tradeSymbol = tradeSymbol;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getUnitsRequired() {
        return unitsRequired;
    }

    public void setUnitsRequired(Integer unitsRequired) {
        this.unitsRequired = unitsRequired;
    }

    public Integer getUnitsFulfilled() {
        return unitsFulfilled;
    }

    public void setUnitsFulfilled(Integer unitsFulfilled) {
        this.unitsFulfilled = unitsFulfilled;
    }
}
