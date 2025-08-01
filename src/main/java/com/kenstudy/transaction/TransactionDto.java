package com.kenstudy.transaction;

import java.time.LocalDate;

public class TransactionDto {
    private Integer id;
    private Integer accountId;
    private Integer recipientId;
    private String description;
    private Double amount;
    private String TransactType;
    private String transactionStatus;
    private LocalDate createdDate;

    public TransactionDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactType() {
        return TransactType;
    }

    public void setTransactType(String transactType) {
        TransactType = transactType;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "TransactionDto{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", recipientId=" + recipientId +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", TransactType='" + TransactType + '\'' +
                ", transactionStatus='" + transactionStatus + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
