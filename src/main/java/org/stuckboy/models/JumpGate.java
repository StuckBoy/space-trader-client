package org.stuckboy.models;

import org.stuckboy.models.waypoint.WaypointSymbol;

import java.util.List;

public class JumpGate {
    private String symbol;
    List<String> connections;

    public WaypointSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(WaypointSymbol symbol) {
        this.symbol = symbol;
    }

    public List<String> getConnections() {
        return connections;
    }

    public void setConnections(List<String> connections) {
        this.connections = connections;
    }
}
