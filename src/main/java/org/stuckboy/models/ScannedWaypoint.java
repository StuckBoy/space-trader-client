package org.stuckboy.models;

import org.stuckboy.models.faction.Faction;
import org.stuckboy.models.waypoint.WaypointOrbital;
import org.stuckboy.models.waypoint.WaypointTrait;
import org.stuckboy.models.waypoint.WaypointType;

import java.util.List;

public class ScannedWaypoint {
    private String symbol;
    private WaypointType type;
    private String systemSymbol;
    private Integer x_position;
    private Integer y_position;
    private List<WaypointOrbital> orbitals;
    private Faction faction;
    private List<WaypointTrait> traits;
    private Chart chart;

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

    public String getSystemSymbol() {
        return systemSymbol;
    }

    public void setSystemSymbol(String systemSymbol) {
        this.systemSymbol = systemSymbol;
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

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public List<WaypointTrait> getTraits() {
        return traits;
    }

    public void setTraits(List<WaypointTrait> traits) {
        this.traits = traits;
    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }
}
