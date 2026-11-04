package org.stuckboy.models.ship.shipnav;

import org.stuckboy.models.system.SystemSymbol;
import org.stuckboy.models.waypoint.WaypointSymbol;

/**
 * Navigational information about a particular {@link org.stuckboy.models.ship.Ship}.
 */
public class ShipNav {
    private SystemSymbol systemSymbol;
    private WaypointSymbol waypointSymbol;
    private ShipNavRoute route;
    private ShipNavStatus status;
    private ShipNavFlightMode flightMode;
}
