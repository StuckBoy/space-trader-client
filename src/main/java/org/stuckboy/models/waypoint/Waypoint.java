package org.stuckboy.models.waypoint;

import org.stuckboy.models.Chart;

import java.util.List;

/**
 * A location that ships can travel to. Such destinations are Planets, Moons,
 * or Space Stations.
 */
public class Waypoint {
    /**
     * The identifier for the Waypoint.
     */
    private String symbol;
    /**
     * The type of the Waypoint.
     */
    private WaypointType type;
    /**
     * The identifier for the {@link org.stuckboy.models.system.System} the
     * Waypoint resides in.
     */
    private String systemSymbol;
    /**
     * Relative position of the Waypoint to the System's X-axis. Not an absolute
     * position within the universe.
     */
    private Integer x_coordinate;
    /**
     * Relative position of the Waypoint to the System's Y-axis. Not an absolute
     * position within the universe.
     */
    private Integer y_coordinate;
    /**
     * Waypoints that orbit this Waypoint.
     */
    private List<WaypointOrbital> orbitals;
    /**
     * The Symbol of the parent Waypoint, if this Waypoint orbits another. If
     * there is no parent, this will be {@code null}.
     */
    private String orbits;
    /**
     * The {@link org.stuckboy.models.faction.Faction} in control of this
     * Waypoint.
     */
    private WaypointFaction faction;
    /**
     * Traits about this particular Waypoint.
     */
    private List<WaypointTrait> traits;
    /**
     * Modifiers of this particular Waypoint.
     */
    private List<WaypointModifier> modifiers;
    /**
     * The {@link Chart} of this Waypoint/System, making it visible to other
     * Agents.
     */
    private Chart chart;
    /**
     * {@code True} if the Waypoint is under construction, {@code False}
     * otherwise.
     */
    private Boolean isUnderConstruction;

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

    public Integer getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(Integer x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public Integer getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(Integer y_coordinate) {
        this.y_coordinate = y_coordinate;
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

    public WaypointFaction getFaction() {
        return faction;
    }

    public void setFaction(WaypointFaction faction) {
        this.faction = faction;
    }

    public List<WaypointTrait> getTraits() {
        return traits;
    }

    public void setTraits(List<WaypointTrait> traits) {
        this.traits = traits;
    }

    public List<WaypointModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<WaypointModifier> modifiers) {
        this.modifiers = modifiers;
    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    public Boolean getUnderConstruction() {
        return isUnderConstruction;
    }

    public void setUnderConstruction(Boolean underConstruction) {
        isUnderConstruction = underConstruction;
    }
}
