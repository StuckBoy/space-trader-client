package org.stuckboy.models.ship;

/**
 * The requirements for installations on a {@link Ship}.
 */
public class ShipRequirements {
    /**
     * The amount of power required by the reactor.
     */
    private Integer power;
    /**
     * The amount of crew required for operation.
     */
    private Integer crew;
    /**
     * The number of module slots required for installation.
     */
    private Integer slots;

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getCrew() {
        return crew;
    }

    public void setCrew(Integer crew) {
        this.crew = crew;
    }

    public Integer getSlots() {
        return slots;
    }

    public void setSlots(Integer slots) {
        this.slots = slots;
    }
}
