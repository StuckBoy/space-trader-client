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
}
