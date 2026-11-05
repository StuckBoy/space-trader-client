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

    public SystemSymbol getSystemSymbol() {
        return systemSymbol;
    }

    public void setSystemSymbol(SystemSymbol systemSymbol) {
        this.systemSymbol = systemSymbol;
    }

    public WaypointSymbol getWaypointSymbol() {
        return waypointSymbol;
    }

    public void setWaypointSymbol(WaypointSymbol waypointSymbol) {
        this.waypointSymbol = waypointSymbol;
    }

    public ShipNavRoute getRoute() {
        return route;
    }

    public void setRoute(ShipNavRoute route) {
        this.route = route;
    }

    public ShipNavStatus getStatus() {
        return status;
    }

    public void setStatus(ShipNavStatus status) {
        this.status = status;
    }

    public ShipNavFlightMode getFlightMode() {
        return flightMode;
    }

    public void setFlightMode(ShipNavFlightMode flightMode) {
        this.flightMode = flightMode;
    }
}
