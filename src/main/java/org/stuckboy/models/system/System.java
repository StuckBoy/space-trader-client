package org.stuckboy.models.system;

import java.util.List;

/**
 * Details about a system.
 */
public class System {
    private String constellation;
    private String symbol;
    private SystemType systemType;
    private Integer x_position;
    private Integer y_position;
    private List<SystemWaypoint> waypoints;
    private List<SystemFaction> factions;
    private String name;
}
