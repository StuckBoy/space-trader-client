package org.stuckboy.models;

import org.stuckboy.models.waypoint.WaypointSymbol;

/**
 * Represents the mapping of a {@link org.stuckboy.models.system.System} or
 * {@link org.stuckboy.models.waypoint.Waypoint}, making it visible to other
 * {@link Agent} entities.
 */
public class Chart {
    private WaypointSymbol waypointSymbol;
    private String submittedBy;
    private String submittedOn;

    public WaypointSymbol getWaypointSymbol() {
        return waypointSymbol;
    }

    public void setWaypointSymbol(WaypointSymbol waypointSymbol) {
        this.waypointSymbol = waypointSymbol;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getSubmittedOn() {
        return submittedOn;
    }

    public void setSubmittedOn(String submittedOn) {
        this.submittedOn = submittedOn;
    }
}
