package org.stuckboy.models.ship;

import org.stuckboy.models.faction.FactionSymbol;

public class ShipRegistration {
    private String name;
    private FactionSymbol factionSymbol;
    private ShipRole role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FactionSymbol getFactionSymbol() {
        return factionSymbol;
    }

    public void setFactionSymbol(FactionSymbol factionSymbol) {
        this.factionSymbol = factionSymbol;
    }

    public ShipRole getRole() {
        return role;
    }

    public void setRole(ShipRole role) {
        this.role = role;
    }
}
