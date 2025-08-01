package com.kenstudy.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kenstudy.bank.BankAddress;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRequestDTO {

    private Integer id;
    private String name;
    private String username;
    private String email;
    private String password;
    private List<BankAddress> bankAddress = new ArrayList<>();

    private LocalDate localDate;

    public CustomerRequestDTO() {
    }

    public CustomerRequestDTO(Integer id, String name, String username, String email, String password, List<BankAddress> bankAddress, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.bankAddress = bankAddress;
        this.localDate = localDate;
    }

    public List<BankAddress> getBankAddress() {
        return bankAddress == null ? new ArrayList<>() : bankAddress;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBankAddress(List<BankAddress> bankAddress) {
        this.bankAddress = bankAddress;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
