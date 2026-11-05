package org.stuckboy.models.ship;

public class ShipModule {
    public enum ShipModuleSymbol {
        MODULE_MINERAL_PROCESSOR_I,
        MODULE_GAS_PROCESSOR_I,
        MODULE_CARGO_HOLD_I,
        MODULE_CARGO_HOLD_II,
        MODULE_CARGO_HOLD_III,
        MODULE_CREW_QUARTERS_I,
        MODULE_ENVOY_QUARTERS_I,
        MODULE_PASSENGER_CABIN_I,
        MODULE_MICRO_REFINERY_I,
        MODULE_ORE_REFINERY_I,
        MODULE_FUEL_REFINERY_I,
        MODULE_SCIENCE_LAB_I,
        MODULE_JUMP_DRIVE_I,
        MODULE_JUMP_DRIVE_II,
        MODULE_JUMP_DRIVE_III,
        MODULE_WARP_DRIVE_I,
        MODULE_WARP_DRIVE_II,
        MODULE_WARP_DRIVE_III,
        MODULE_SHIELD_GENERATOR_I,
        MODULE_SHIELD_GENERATOR_II
    }

    private ShipModuleSymbol symbol;
    private String name;
    private Integer capacity;
    private Integer range;
    private ShipRequirements requirements;

    public ShipModuleSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(ShipModuleSymbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public ShipRequirements getRequirements() {
        return requirements;
    }

    public void setRequirements(ShipRequirements requirements) {
        this.requirements = requirements;
    }

}
