package org.stuckboy.models;

import java.util.List;

public class Survey {

    private String signature;
    private String symbol;
    private List<SurveyDeposit> deposits;
    private String expiration;
    private SurveySize size;

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<SurveyDeposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<SurveyDeposit> deposits) {
        this.deposits = deposits;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public SurveySize getSize() {
        return size;
    }

    public void setSize(SurveySize size) {
        this.size = size;
    }
}
