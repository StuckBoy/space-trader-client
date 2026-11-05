package org.stuckboy.models.ship;

import java.util.List;

public class ShipMount {
    public enum MountSymbol {
        MOUNT_GAS_SIPHON_I,
        MOUNT_GAS_SIPHON_II,
        MOUNT_GAS_SIPHON_III,
        MOUNT_SURVEYOR_I,
        MOUNT_SURVEYOR_II,
        MOUNT_SURVEYOR_III,
        MOUNT_SENSOR_ARRAY_I,
        MOUNT_SENSOR_ARRAY_II,
        MOUNT_SENSOR_ARRAY_III,
        MOUNT_MINING_LASER_I,
        MOUNT_MINING_LASER_II,
        MOUNT_MINING_LASER_III,
        MOUNT_LASER_CANNON_I,
        MOUNT_MISSILE_LAUNCHER_I,
        MOUNT_TURRET_I
    }

    private MountSymbol symbol;
    private String name;
    private String description;
    private Integer strength;
    //TODO Should this be a list of a concrete enum?
    private List<String> deposits;
    private ShipRequirements requirements;
}
