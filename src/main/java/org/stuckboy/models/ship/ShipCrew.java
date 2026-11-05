package org.stuckboy.models.ship;

public class ShipCrew {

    public static enum Rotation {
        STRICT,
        RELAXED;
    }

    private Integer current;
    private Integer required;
    private Integer capacity;
    private Rotation rotation;
    private Integer morale;
    private Integer wages;
}
