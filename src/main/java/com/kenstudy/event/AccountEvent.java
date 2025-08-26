package com.kenstudy.event;


import com.kenstudy.event.status.AccountStatus;
import com.kenstudy.payment.PaymentRequestDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public class AccountEvent implements Event, CancelableEvent<PaymentRequestDTO, AccountStatus>{

    private LocalDateTime eventDate = LocalDateTime.now();
    private UUID eventId = UUID.randomUUID();
    private PaymentRequestDTO paymentRequestDTO;
    private boolean error;
    private String errorMessage;
    private AccountStatus accountStatus;
    private boolean isEventClosed;
    private UUID customerEventId;

    public AccountEvent() {
    }

    public AccountEvent(PaymentRequestDTO paymentRequestDTO, boolean error, String errorMessage, AccountStatus accountStatus,
                        boolean isEventClosed) {
        this.paymentRequestDTO = paymentRequestDTO;
        this.errorMessage = errorMessage;
        this.accountStatus = accountStatus;
        this.isEventClosed = isEventClosed;
        this.error =error;
    }

    @Override
    public LocalDateTime eventDate() {
        return eventDate;
    }

    @Override
    public UUID getEventId() {
        return eventId;
    }


    @Override
    public void setRequestDTO(PaymentRequestDTO dto) {
        this.paymentRequestDTO = dto;
    }

    @Override
    public void setErrorMessage(String message) {
        this.errorMessage = message;
    }

    @Override
    public void setError(boolean isError) {
        this.error = isError;
    }

    @Override
    public void setStatus(AccountStatus status) {
        this.accountStatus = status;
    }

    @Override
    public void setEventClosed(boolean eventClosed) {
        this.isEventClosed = eventClosed;
    }


    public boolean isError() {
        return error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public PaymentRequestDTO getPaymentRequestDTO() {
        return paymentRequestDTO;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public boolean isEventClosed() {
        return isEventClosed;
    }

    public UUID getCustomerEventId() {
        return customerEventId;
    }

    public void setCustomerEventId(UUID customerEventId) {
        this.customerEventId = customerEventId;
    }

    @Override
    public String toString() {
        return "AccountEvent{" +
                "eventDate=" + eventDate +
                ", eventId=" + eventId +
                ", paymentRequestDTO=" + paymentRequestDTO +
                ", error=" + error +
                ", errorMessage='" + errorMessage + '\'' +
                ", accountStatus=" + accountStatus +
                ", isEventClosed=" + isEventClosed +
                ", customerEventId=" + customerEventId +
                '}';
    }
}
