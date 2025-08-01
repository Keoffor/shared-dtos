package com.kenstudy.account;


import java.time.LocalDate;

public class AccountBalanceDTO {
    private Integer accountId;
    private Double balance;
    private String accountNumber;
    private String accountType;
    private Integer customersId;
    private LocalDate recordedAt;

    public AccountBalanceDTO() {
    }

    public AccountBalanceDTO(Integer accountId, Double balance, String accountNumber, String accountType, Integer customersId, LocalDate recordedAt) {
        this.accountId = accountId;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.customersId = customersId;
        this.recordedAt = recordedAt;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getCustomersId() {
        return customersId;
    }

    public void setCustomersId(Integer customersId) {
        this.customersId = customersId;
    }

    public LocalDate getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(LocalDate recordedAt) {
        this.recordedAt = recordedAt;
    }

    @Override
    public String toString() {
        return "AccountBalanceDTO{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", customersId=" + customersId +
                ", recordedAt=" + recordedAt +
                '}';
    }
}
