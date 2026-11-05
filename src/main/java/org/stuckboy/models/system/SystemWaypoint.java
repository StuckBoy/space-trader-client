package org.stuckboy.models.system;

import org.stuckboy.models.waypoint.WaypointOrbital;
import org.stuckboy.models.waypoint.WaypointType;

import java.util.List;

public class SystemWaypoint {
    private String symbol;
    private WaypointType type;
    private Integer x_position;
    private Integer y_position;
    private List<WaypointOrbital> orbitals;
    private String orbits;

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

    public List<WaypointOrbital> getOrbitals() {
        return orbitals;
    }

    public void setOrbitals(List<WaypointOrbital> orbitals) {
        this.orbitals = orbitals;
    }

    public String getOrbits() {
        return orbits;
    }

    public void setOrbits(String orbits) {
        this.orbits = orbits;
    }
}
