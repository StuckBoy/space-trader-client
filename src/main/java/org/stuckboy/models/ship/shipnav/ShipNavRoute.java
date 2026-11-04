package org.stuckboy.models.ship.shipnav;

import org.stuckboy.models.waypoint.Waypoint;

/**
 * Information about the most recent transit or current location of a given
 * {@link org.stuckboy.models.ship.Ship}.
 */
public class ShipNavRoute {
    private Waypoint destination;
    private Waypoint origin;
    private String departureTime;
    private String arrival;
}
