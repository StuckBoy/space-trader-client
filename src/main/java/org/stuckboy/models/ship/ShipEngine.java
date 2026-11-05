package org.stuckboy.models.ship;

import org.stuckboy.models.ship.shipcomponent.ShipComponentCondition;
import org.stuckboy.models.ship.shipcomponent.ShipComponentIntegrity;
import org.stuckboy.models.ship.shipcomponent.ShipComponentQuality;

public class ShipEngine {
    public enum ShipEngineSymbol {
        ENGINE_IMPULSE_DRIVE_I,
        ENGINE_ION_DRIVE_I,
        ENGINE_ION_DRIVE_II,
        ENGINE_HYPER_DRIVE_I
    }

    private ShipEngineSymbol symbol;
    private String name;
    private ShipComponentCondition condition;
    private ShipComponentIntegrity integrity;
    private String description;
    private Integer speed;
    private ShipRequirements requirements;
    private ShipComponentQuality quality;

    public ShipEngineSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(ShipEngineSymbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShipComponentCondition getCondition() {
        return condition;
    }

    public void setCondition(ShipComponentCondition condition) {
        this.condition = condition;
    }

    public ShipComponentIntegrity getIntegrity() {
        return integrity;
    }

    public void setIntegrity(ShipComponentIntegrity integrity) {
        this.integrity = integrity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public ShipRequirements getRequirements() {
        return requirements;
    }

    public void setRequirements(ShipRequirements requirements) {
        this.requirements = requirements;
    }

    public ShipComponentQuality getQuality() {
        return quality;
    }

    public void setQuality(ShipComponentQuality quality) {
        this.quality = quality;
    }

}
