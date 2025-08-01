package com.kenstudy.payment;

import java.time.LocalDate;

public class PaymentResponseDTO {
    private Integer id;
    private Double amount;
    private Integer customerId;
    private Integer accountId;
    private Integer transactionId;
    private Integer recipientId;
    private String DeliveryStatus;
    private Boolean status;
    private LocalDate createdDate;

    public PaymentResponseDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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

    public String getDeliveryStatus() {
        return DeliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        DeliveryStatus = deliveryStatus;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
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
        return "PaymentResponseDTO{" +
                "id=" + id +
                ", amount=" + amount +
                ", customerId=" + customerId +
                ", accountId=" + accountId +
                ", transactionId=" + transactionId +
                ", recipientId=" + recipientId +
                ", DeliveryStatus='" + DeliveryStatus + '\'' +
                ", status=" + status +
                ", createdDate=" + createdDate +
                '}';
    }
}
