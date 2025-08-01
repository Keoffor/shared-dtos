package com.kenstudy.transaction;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TransferRequestDTO {
    private Integer senderAcctId;
    private Integer senderId;
    private Integer recipientAcctId;
    private Integer recipientId;
    private String description;
    private String status;
    private Double amount;
    @JsonIgnore
    private Integer transactId;

    public TransferRequestDTO() {
    }

    public TransferRequestDTO(Integer senderAcctId, Integer senderId, Integer recipientAcctId,
                              Integer recipientId, String description, String status, Double amount, Integer transactId) {
        this.senderAcctId = senderAcctId;
        this.senderId = senderId;
        this.recipientAcctId = recipientAcctId;
        this.recipientId = recipientId;
        this.description = description;
        this.status = status;
        this.amount = amount;
        this.transactId = transactId;
    }

    public Integer getSenderAcctId() {
        return senderAcctId;
    }
    public void setSenderAcctId(Integer senderAcctId) {
        this.senderAcctId = senderAcctId;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getRecipientAcctId() {
        return recipientAcctId;
    }

    public void setRecipientAcctId(Integer recipientAcctId) {
        this.recipientAcctId = recipientAcctId;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }



    public Integer getTransactId() {
        return transactId;
    }

    public void setTransactId(Integer transactId) {
        this.transactId = transactId;
    }
}
