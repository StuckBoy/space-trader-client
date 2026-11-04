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
}
