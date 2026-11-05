package org.stuckboy.models.faction;

import java.util.List;

public class Faction {
    private FactionSymbol symbol;
    private String name;
    private String description;
    private String headquarters;
    private List<FactionTrait> traits;
    private boolean isRecruiting;

    public FactionSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(FactionSymbol symbol) {
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

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public List<FactionTrait> getTraits() {
        return traits;
    }

    public void setTraits(List<FactionTrait> traits) {
        this.traits = traits;
    }

    public boolean isRecruiting() {
        return isRecruiting;
    }

    public void setRecruiting(boolean recruiting) {
        isRecruiting = recruiting;
    }
}
