package com.kenstudy.account;

import java.time.LocalDate;

public class DebitAndCreditResponseDTO {
    private Double amount;
    private Integer senderAccountId;
    private Integer transactionId;
    private Integer recipientId;
    private String status;
    private LocalDate createdDate;

    public DebitAndCreditResponseDTO() {
    }

    public DebitAndCreditResponseDTO(Double amount,Integer senderAccountId,
                                     Integer transactionId, Integer recipientId, String status,
                                     LocalDate createdDate) {
        this.amount = amount;
        this.senderAccountId = senderAccountId;
        this.transactionId = transactionId;
        this.recipientId = recipientId;
        this.status = status;
        this.createdDate = createdDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getSenderAccountId() {
        return senderAccountId;
    }

    public void setSenderAccountId(Integer senderAccountId) {
        this.senderAccountId = senderAccountId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "DebitAndCreditResponseDTO{" +
                "amount=" + amount +
                ", senderAccountId=" + senderAccountId +
                ", transactionId=" + transactionId +
                ", recipientId=" + recipientId +
                ", status=" + status +
                ", createdDate=" + createdDate +
                '}';
    }
}
