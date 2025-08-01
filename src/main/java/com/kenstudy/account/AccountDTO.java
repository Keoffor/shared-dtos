package com.kenstudy.account;

public class AccountDTO {
    private Integer userId;

    public AccountDTO(Integer userId) {
        this.userId = userId;
    }

    public AccountDTO() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
