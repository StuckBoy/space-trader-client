package org.stuckboy.models.contract;

import org.stuckboy.models.faction.FactionSymbol;

public class Contract {
    private String id;
    private FactionSymbol factionSymbol;
    private ContractType type;
    private ContractTerms terms;
    private Boolean accepted;
    private Boolean fulfilled;
    private String deadlineToAccept;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FactionSymbol getFactionSymbol() {
        return factionSymbol;
    }

    public void setFactionSymbol(FactionSymbol factionSymbol) {
        this.factionSymbol = factionSymbol;
    }

    public ContractType getType() {
        return type;
    }

    public void setType(ContractType type) {
        this.type = type;
    }

    public ContractTerms getTerms() {
        return terms;
    }

    public void setTerms(ContractTerms terms) {
        this.terms = terms;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public Boolean getFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(Boolean fulfilled) {
        this.fulfilled = fulfilled;
    }

    public String getDeadlineToAccept() {
        return deadlineToAccept;
    }

    public void setDeadlineToAccept(String deadlineToAccept) {
        this.deadlineToAccept = deadlineToAccept;
    }
}
