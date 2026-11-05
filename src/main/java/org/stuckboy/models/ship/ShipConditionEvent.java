package org.stuckboy.models.ship;

public class ShipConditionEvent {
    public enum EventType {
        REACTOR_OVERLOAD,
        ENERGY_SPIKE_FROM_MINERAL,
        SOLAR_FLARE_INTERFERENCE,
        COOLANT_LEAK,
        POWER_DISTRIBUTION_FLUCTUATION
    }

    public enum ComponentType {
        FRAME,
        REACTOR,
        ENGINE
    }

    private EventType symbol;
    private ComponentType component;
    private String name;
    private String description;

    public EventType getSymbol() {
        return symbol;
    }

    public void setSymbol(EventType symbol) {
        this.symbol = symbol;
    }

    public ComponentType getComponent() {
        return component;
    }

    public void setComponent(ComponentType component) {
        this.component = component;
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
