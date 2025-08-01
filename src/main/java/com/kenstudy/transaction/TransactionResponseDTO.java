package com.kenstudy.transaction;

import java.time.LocalDate;

public class TransactionResponseDTO {
    private Integer transactionId;
    private Integer accountId;
    private Double amount;
    private String transactionType;
    private Integer customerId;
    private Integer recipientId;
    private String description;
    private String status;
    private LocalDate createdDated;

    public TransactionResponseDTO() {
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatedDated() {
        return createdDated;
    }

    public void setCreatedDated(LocalDate createdDated) {
        this.createdDated = createdDated;
    }

    public TransactionResponseDTO(Integer transactionId, Integer accountId, Double amount,
                                  String transactionType,Integer customerId,
                                  Integer recipientId, String description, String status,
                                  LocalDate createdDated) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.customerId = customerId;
        this.recipientId = recipientId;
        this.description = description;
        this.status = status;
        this.createdDated = createdDated;


    }

    @Override
    public String toString() {
        return "TransactionResponseDTO{" +
                "transactionId=" + transactionId +
                ", accountId=" + accountId +
                ", amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                ", customerId=" + customerId +
                ", recipientId=" + recipientId +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", createdDated=" + createdDated +
                '}';
    }
}
