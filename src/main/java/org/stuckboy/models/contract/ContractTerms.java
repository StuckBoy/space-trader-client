package org.stuckboy.models.contract;

import java.util.List;

public class ContractTerms {
    private String deadline;
    private ContractPayment payment;
    private List<ContractDeliverGood> deliver;

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public ContractPayment getPayment() {
        return payment;
    }

    public void setPayment(ContractPayment payment) {
        this.payment = payment;
    }

    public List<ContractDeliverGood> getDeliver() {
        return deliver;
    }

    public void setDeliver(List<ContractDeliverGood> deliver) {
        this.deliver = deliver;
    }
}
