package org.stuckboy.models.ship;

import org.stuckboy.models.ship.shipcomponent.ShipComponentCondition;
import org.stuckboy.models.ship.shipcomponent.ShipComponentIntegrity;
import org.stuckboy.models.ship.shipcomponent.ShipComponentQuality;

public class ShipReactor {
    public enum ReactorSymbol {
        REACTOR_SOLAR_I,
        REACTOR_FUSION_I,
        REACTOR_FISSION_I,
        REACTOR_CHEMICAL_I,
        REACTOR_ANTIMATTER_1
    }

    private ReactorSymbol symbol;
    private String name;
    private ShipComponentCondition condition;
    private ShipComponentIntegrity integrity;
    private String description;
    private Integer powerOutput;
    private ShipRequirements requirements;
    private ShipComponentQuality quality;

    public ReactorSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(ReactorSymbol symbol) {
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

    public Integer getPowerOutput() {
        return powerOutput;
    }

    public void setPowerOutput(Integer powerOutput) {
        this.powerOutput = powerOutput;
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
