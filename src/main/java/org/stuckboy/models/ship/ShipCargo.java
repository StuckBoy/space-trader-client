package org.stuckboy.models.ship;

import java.util.List;

/**
 * Details pertaining to the cargo within a given {@link Ship}.
 */
public class ShipCargo {
    private Integer capacity;
    private Integer units;
    private List<ShipCargoItem> inventory;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public List<ShipCargoItem> getInventory() {
        return inventory;
    }

    public void setInventory(List<ShipCargoItem> inventory) {
        this.inventory = inventory;
    }
}
