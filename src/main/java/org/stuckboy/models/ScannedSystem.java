package org.stuckboy.models;

import org.stuckboy.models.system.SystemType;

public class ScannedSystem {
    private String symbol;
    private String sectorSymbol;
    private SystemType type;
    private Integer x_position;
    private Integer y_position;
    private Integer distance;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSectorSymbol() {
        return sectorSymbol;
    }

    public void setSectorSymbol(String sectorSymbol) {
        this.sectorSymbol = sectorSymbol;
    }

    public SystemType getType() {
        return type;
    }

    public void setType(SystemType type) {
        this.type = type;
    }

    public Integer getX_position() {
        return x_position;
    }

    public void setX_position(Integer x_position) {
        this.x_position = x_position;
    }

    public Integer getY_position() {
        return y_position;
    }

    public void setY_position(Integer y_position) {
        this.y_position = y_position;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
