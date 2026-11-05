package org.stuckboy.models.ship.shipcomponent;

/**
 * The indicator of a component's quality. Higher quality components return
 * more parts and plating when a ship is scrapped. They also require more of
 * these parts to be repaired.
 */
public class ShipComponentQuality {
    private Integer quality;

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }
}
