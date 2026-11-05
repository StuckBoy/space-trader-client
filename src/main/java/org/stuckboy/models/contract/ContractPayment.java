package org.stuckboy.models.contract;

/**
 * The payments for a contract.
 */
public class ContractPayment {
    /**
     * The amount received when accepting a contract.
     */
    private Integer onAccepted;
    /**
     * The amount received upon fulfilling a contract.
     */
    private Integer onFulfilled;

    public Integer getOnAccepted() {
        return onAccepted;
    }

    public void setOnAccepted(Integer onAccepted) {
        this.onAccepted = onAccepted;
    }

    public Integer getOnFulfilled() {
        return onFulfilled;
    }

    public void setOnFulfilled(Integer onFulfilled) {
        this.onFulfilled = onFulfilled;
    }
}
