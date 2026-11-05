package org.stuckboy.models.waypoint;

/**
 * An orbital is another waypoint that orbits a parent waypoint.
 */
public class WaypointOrbital {
    /**
     * The symbol of the orbiting waypoint.
     */
    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
