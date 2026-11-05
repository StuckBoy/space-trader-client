package org.stuckboy.models;

import java.util.List;

/**
 * The construction details of a {@link org.stuckboy.models.waypoint.Waypoint}.
 */
public class Construction {
    private String symbol;
    private List<ConstructionMaterial> materials;
    private boolean isComplete;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<ConstructionMaterial> getMaterials() {
        return materials;
    }

    public void setMaterials(List<ConstructionMaterial> materials) {
        this.materials = materials;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
