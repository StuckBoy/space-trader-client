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

    public Waypoint getDestination() {
        return destination;
    }

    public void setDestination(Waypoint destination) {
        this.destination = destination;
    }

    public Waypoint getOrigin() {
        return origin;
    }

    public void setOrigin(Waypoint origin) {
        this.origin = origin;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
}
