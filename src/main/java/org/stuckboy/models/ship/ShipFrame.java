package org.stuckboy.models.ship;

import org.stuckboy.models.ship.shipcomponent.ShipComponentCondition;
import org.stuckboy.models.ship.shipcomponent.ShipComponentIntegrity;
import org.stuckboy.models.ship.shipcomponent.ShipComponentQuality;

public class ShipFrame {
    public enum ShipFrameSymbol {
        FRAME_PROBE,
        FRAME_DRONE,
        FRAME_INTERCEPTOR,
        FRAME_RACER,
        FRAME_FIGHTER,
        FRAME_FRIGATE,
        FRAME_SHUTTLE,
        FRAME_EXPLORER,
        FRAME_MINER,
        FRAME_LIGHT_FREIGHTER,
        FRAME_HEAVY_FREIGHTER,
        FRAME_TRANSPORT,
        FRAME_DESTROYER,
        FRAME_CRUISER,
        FRAME_CARRIER,
        FRAME_BULK_FREIGHTER
    }

    private ShipFrameSymbol symbol;
    private String name;
    private ShipComponentCondition condition;
    private ShipComponentIntegrity integrity;
    private String description;
    private Integer moduleSlots;
    private Integer mountingPoints;
    private Integer fuelCapacity;
    private ShipRequirements requirements;
    private ShipComponentQuality quality;

    public ShipFrameSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(ShipFrameSymbol symbol) {
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

    public Integer getModuleSlots() {
        return moduleSlots;
    }

    public void setModuleSlots(Integer moduleSlots) {
        this.moduleSlots = moduleSlots;
    }

    public Integer getMountingPoints() {
        return mountingPoints;
    }

    public void setMountingPoints(Integer mountingPoints) {
        this.mountingPoints = mountingPoints;
    }

    public Integer getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Integer fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
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
