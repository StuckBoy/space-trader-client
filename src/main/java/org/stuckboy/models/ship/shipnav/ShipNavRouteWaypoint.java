package org.stuckboy.models.ship.shipnav;

import org.stuckboy.models.system.SystemSymbol;
import org.stuckboy.models.waypoint.WaypointType;

/**
 * The destination or departure of a Ship's nav route.
 */
public class ShipNavRouteWaypoint {
    /**
     * The symbol of the {@link org.stuckboy.models.waypoint.Waypoint}.
     */
    private String symbol;
    /**
     * The type of the Waypoint.
     */
    private WaypointType type;
    /**
     * The symbol of the {@link org.stuckboy.models.system.System}.
     */
    private SystemSymbol symbolSystem;
    /**
     * The position within the Universe, relative to the X-axis.
     */
    private Integer x_position;
    /**
     * The position within the Universe, relative to the Y-axis.
     */
    private Integer y_position;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public WaypointType getType() {
        return type;
    }

    public void setType(WaypointType type) {
        this.type = type;
    }

    public SystemSymbol getSymbolSystem() {
        return symbolSystem;
    }

    public void setSymbolSystem(SystemSymbol symbolSystem) {
        this.symbolSystem = symbolSystem;
    }

    public Integer getX_position() {
        return x_position;
    }

    public void setX_position(Integer x_position) {
        this.x_position = x_position;
    }

    public Integer getY_position() {
        return y_position;
    }

    public void setY_position(Integer y_position) {
        this.y_position = y_position;
    }
}
