package org.stuckboy.models.ship.shipcomponent;

/**
 * The indicator of a component's integrity, which dictates the component's
 * performance capabilities. A value approaching zero indicates a component that
 * is nearly degraded. A value approaching one indicates a component that is
 * near perfect condition. This value can never increase, and represents the
 * permanent wear over time.
 */
public class ShipComponentIntegrity {
    private Double integrity;

    public Double getIntegrity() {
        return integrity;
    }

    public void setIntegrity(Double integrity) {
        this.integrity = integrity;
    }
}
