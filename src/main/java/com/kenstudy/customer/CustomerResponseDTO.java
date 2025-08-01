package com.kenstudy.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kenstudy.bank.BankAddress;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerResponseDTO {

    private Integer id;
    private String name;
    private String username;
    private String email;
    private List<BankAddress> bankAddress = new ArrayList<>();
    private Integer accountId;
    private List<CustomerAccount> customerAccounts = new ArrayList<>();
    private LocalDate localDate;

    public CustomerResponseDTO() {
    }

    public CustomerResponseDTO(Integer id, String name, String username, String email,
                               List<BankAddress> bankAddress, Integer accountId,
                               List<CustomerAccount> customerAccounts, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.bankAddress = bankAddress;
        this.accountId = accountId;
        this.customerAccounts = customerAccounts;
        this.localDate = localDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BankAddress> getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(List<BankAddress> bankAddress) {
        this.bankAddress = bankAddress;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public List<CustomerAccount> getCustomerAccounts() {
        return customerAccounts;
    }

    public void setCustomerAccounts(List<CustomerAccount> customerAccounts) {
        this.customerAccounts = customerAccounts;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "CustomerResponseDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", bankAddress=" + bankAddress +
                ", accountId=" + accountId +
                ", customerAccounts=" + customerAccounts +
                ", localDate=" + localDate +
                '}';
    }
}
