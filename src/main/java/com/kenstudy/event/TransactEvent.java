package com.kenstudy.event;

import com.kenstudy.event.status.TransStatus;
import com.kenstudy.transaction.TransferRequestDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public class TransactEvent implements Event, CancelableEvent<TransferRequestDTO,TransStatus>{
    private LocalDateTime eventDate = LocalDateTime.now();
    private UUID eventId = UUID.randomUUID();
    private TransferRequestDTO transRequestDTO;
    private String errorMessage;
    private TransStatus transStatus;
    private boolean error;
    private boolean isEventClosed;
    private UUID customerEventId;

    public TransactEvent() {
    }

    public TransactEvent(TransferRequestDTO transRequestDTO, boolean error, TransStatus transStatus, String errorMessage,
                        boolean isEventClosed) {
        this.transRequestDTO = transRequestDTO;
        this.errorMessage = errorMessage;
        this.transStatus = transStatus;
        this.isEventClosed= isEventClosed;
        this.error = error;
    }


    @Override
    public void setRequestDTO(TransferRequestDTO dto) {
        this.transRequestDTO = dto;
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
    public void setStatus(TransStatus status) {
     this.transStatus = status;
    }

    @Override
    public void setEventClosed(boolean isClosed) {
     this.isEventClosed =isClosed;
    }

    @Override
    public LocalDateTime eventDate() {
        return eventDate;
    }

    @Override
    public UUID getEventId() {
        return eventId;
    }


    public TransferRequestDTO getTransRequestDTO() {
        return transRequestDTO;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public TransStatus getTransStatus() {
        return transStatus;
    }

    public boolean isError() {
        return error;
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
        return "TransactEvent{" +
                "eventDate=" + eventDate +
                ", eventId=" + eventId +
                ", transRequestDTO=" + transRequestDTO +
                ", errorMessage='" + errorMessage + '\'' +
                ", transStatus=" + transStatus +
                ", error=" + error +
                ", isEventClosed=" + isEventClosed +
                ", customerEventId=" + customerEventId +
                '}';
    }
}
