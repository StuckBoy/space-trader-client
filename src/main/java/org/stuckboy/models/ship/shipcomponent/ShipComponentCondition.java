package org.stuckboy.models.ship.shipcomponent;

/**
 * The indicator of the repairable condition of a component. A value approaching
 * zero indicates the need for significant repair. A value approaching one
 * indicates near perfect or perfect condition. This value is
 * inversely-correlated with {@link ShipComponentIntegrity}.
 */
public class ShipComponentCondition {
    private Double condition;

    public Double getCondition() {
        return condition;
    }

    public void setCondition(Double condition) {
        this.condition = condition;
    }
}
