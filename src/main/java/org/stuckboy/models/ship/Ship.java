package org.stuckboy.models.ship;

import org.stuckboy.models.Cooldown;
import org.stuckboy.models.ship.shipnav.ShipNav;

import java.util.List;

public class Ship {
    private String symbol;
    private ShipRegistration registration;
    private ShipNav nav;
    private ShipCrew crew;
    private ShipFrame frame;
    private ShipReactor reactor;
    private ShipEngine engine;
    private List<ShipModule> modules;
    private List<ShipMount>  mounts;
    private ShipCargo cargo;
    private ShipFuel fuel;
    private Cooldown cooldown;

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

    public ShipCrew getCrew() {
        return crew;
    }

    public void setCrew(ShipCrew crew) {
        this.crew = crew;
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

    public List<ShipModule> getModules() {
        return modules;
    }

    public void setModules(List<ShipModule> modules) {
        this.modules = modules;
    }

    public List<ShipMount> getMounts() {
        return mounts;
    }

    public void setMounts(List<ShipMount> mounts) {
        this.mounts = mounts;
    }

    public ShipCargo getCargo() {
        return cargo;
    }

    public void setCargo(ShipCargo cargo) {
        this.cargo = cargo;
    }

    public ShipFuel getFuel() {
        return fuel;
    }

    public void setFuel(ShipFuel fuel) {
        this.fuel = fuel;
    }

    public Cooldown getCooldown() {
        return cooldown;
    }

    public void setCooldown(Cooldown cooldown) {
        this.cooldown = cooldown;
    }
}
