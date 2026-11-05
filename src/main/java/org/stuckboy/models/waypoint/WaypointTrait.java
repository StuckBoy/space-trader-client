package org.stuckboy.models.waypoint;

public class WaypointTrait {
    private WaypointSymbol symbol;
    private String name;
    private String description;

    public WaypointSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(WaypointSymbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
