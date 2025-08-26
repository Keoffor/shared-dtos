package com.kenstudy.payment;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PaymentRequestDTO {
    private Integer accountId;
    private Integer recipientAcctId;
    private Integer recipientId;
    private Integer transactionId;
    private String transactStatus;
    private Double amount;
    private Integer customerId;
    private String description;


    public PaymentRequestDTO() {
    }

    public PaymentRequestDTO(Integer accountId, Integer recipientAcctId, Integer recipientId,
                             Integer transactionId, String transactStatus, Double amount, Integer customerId,
                             String description) {
        this.accountId = accountId;
        this.recipientAcctId = recipientAcctId;
        this.recipientId = recipientId;
        this.transactionId = transactionId;
        this.transactStatus = transactStatus;
        this.amount = amount;
        this.customerId = customerId;
        this.description = description;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactStatus() {
        return transactStatus;
    }

    public void setTransactStatus(String transactStatus) {
        this.transactStatus = transactStatus;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public Integer getRecipientAcctId() {
        return recipientAcctId;
    }

    public void setRecipientAcctId(Integer recipientAcctId) {
        this.recipientAcctId = recipientAcctId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PaymentRequestDTO{" +
                "accountId=" + accountId +
                ", recipientAcctId=" + recipientAcctId +
                ", recipientId=" + recipientId +
                ", transactionId=" + transactionId +
                ", transactStatus='" + transactStatus + '\'' +
                ", amount=" + amount +
                ", customerId=" + customerId +
                ", description='" + description + '\'' +
                '}';
    }
}
