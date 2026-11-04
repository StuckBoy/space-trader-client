package org.stuckboy.models.ship;

import java.util.List;

/**
 * Details pertaining to the cargo within a given {@link Ship}.
 */
public class ShipCargo {
    private Integer capacity;
    private Integer units;
    private List<ShipCargoItem> inventory;
}
