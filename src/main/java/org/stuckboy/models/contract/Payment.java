package org.stuckboy.models.contract;

/**
 * The monetary compensation included with a {@link Contract}
 */
public class Payment {
    /**
     * The amount of credits received up front for accepting a contract.
     */
    private Integer onAccepted;

    /**
     * The amount of credits received for fulfilling a contract.
     */
    private Integer onFulfilled;

    public Integer getOnFulfilled() {
        return onFulfilled;
    }

    public void setOnFulfilled(Integer onFulfilled) {
        this.onFulfilled = onFulfilled;
    }

    public Integer getOnAccepted() {
        return onAccepted;
    }

    public void setOnAccepted(Integer onAccepted) {
        this.onAccepted = onAccepted;
    }
}
