package org.stuckboy.models;

import org.stuckboy.models.ship.*;
import org.stuckboy.models.ship.shipnav.ShipNav;

import java.util.List;

public class ScannedShip {
    private String symbol;
    private ShipRegistration registration;
    private ShipNav nav;
    private ShipFrame frame;
    private ShipReactor reactor;
    private ShipEngine engine;
    private List<ShipMount> mounts;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public ShipRegistration getRegistration() {
        return registration;
    }

    public void setRegistration(ShipRegistration registration) {
        this.registration = registration;
    }

    public ShipNav getNav() {
        return nav;
    }

    public void setNav(ShipNav nav) {
        this.nav = nav;
    }

    public ShipFrame getFrame() {
        return frame;
    }

    public void setFrame(ShipFrame frame) {
        this.frame = frame;
    }

    public ShipReactor getReactor() {
        return reactor;
    }

    public void setReactor(ShipReactor reactor) {
        this.reactor = reactor;
    }

    public ShipEngine getEngine() {
        return engine;
    }

    public void setEngine(ShipEngine engine) {
        this.engine = engine;
    }

    public List<ShipMount> getMounts() {
        return mounts;
    }

    public void setMounts(List<ShipMount> mounts) {
        this.mounts = mounts;
    }
}
