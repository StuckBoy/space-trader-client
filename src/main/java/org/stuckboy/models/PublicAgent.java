package org.stuckboy.models;

/**
 * Public details about an Agent
 */
public class PublicAgent {
    /**
     * The symbol representing the agent.
     */
    private String symbol;
    /**
     * The headquarters of the agent.
     */
    private String headquarters;
    /**
     * The number of credits the Agent has available. Negative values indicate
     * overdrawn funds.
     */
    private Integer credits;
    /**
     * The faction the Agent began with.
     */
    private String startingFaction;
    /**
     * How many ships are directly owned by the Agent.
     */
    private Integer shipCount;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getStartingFaction() {
        return startingFaction;
    }

    public void setStartingFaction(String startingFaction) {
        this.startingFaction = startingFaction;
    }

    public Integer getShipCount() {
        return shipCount;
    }

    public void setShipCount(Integer shipCount) {
        this.shipCount = shipCount;
    }
}
