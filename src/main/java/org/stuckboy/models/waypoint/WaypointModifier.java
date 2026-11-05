package org.stuckboy.models.waypoint;

public class WaypointModifier {
    private WaypointModifierSymbol symbol;
    private String name;
    private String description;

    public WaypointModifierSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(WaypointModifierSymbol symbol) {
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
