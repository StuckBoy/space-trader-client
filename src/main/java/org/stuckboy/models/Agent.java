package org.stuckboy.models;

public class Agent {
    private String accountId;
    private String symbol;
    private String headquarters;
    private Integer credits;
    private String startingFaction;
    private Integer shipCount;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

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
