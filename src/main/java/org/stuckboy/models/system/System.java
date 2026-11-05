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

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public SystemType getSystemType() {
        return systemType;
    }

    public void setSystemType(SystemType systemType) {
        this.systemType = systemType;
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

    public List<SystemWaypoint> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<SystemWaypoint> waypoints) {
        this.waypoints = waypoints;
    }

    public List<SystemFaction> getFactions() {
        return factions;
    }

    public void setFactions(List<SystemFaction> factions) {
        this.factions = factions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
