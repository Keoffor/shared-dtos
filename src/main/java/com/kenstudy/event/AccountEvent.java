package com.kenstudy.event;


import com.kenstudy.event.status.AccountStatus;
import com.kenstudy.payment.PaymentRequestDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public class AccountEvent implements Event{

    private LocalDateTime eventDate = LocalDateTime.now();
    private UUID eventId = UUID.randomUUID();
    private PaymentRequestDTO paymentRequestDTO;
    private String errorMessage;
    private AccountStatus accountStatus;

    public AccountEvent() {
    }

    public AccountEvent(PaymentRequestDTO paymentRequestDTO, String errorMessage, AccountStatus accountStatus) {
        this.paymentRequestDTO = paymentRequestDTO;
        this.errorMessage = errorMessage;
        this.accountStatus = accountStatus;
    }

    @Override
    public LocalDateTime eventDate() {
        return eventDate;
    }

    @Override
    public UUID getEventId() {
        return eventId;
    }

    public PaymentRequestDTO getPaymentRequestDTO() {
        return paymentRequestDTO;
    }

    public void setPaymentRequestDTO(PaymentRequestDTO paymentRequestDTO) {
        this.paymentRequestDTO = paymentRequestDTO;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }
}
