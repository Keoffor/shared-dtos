package com.kenstudy.event;

import com.kenstudy.event.status.CustomerStatus;
import com.kenstudy.transaction.TransferRequestDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public class CustomerEvent implements Event, CancelableEvent<TransferRequestDTO, CustomerStatus>{
    private LocalDateTime eventDate = LocalDateTime.now();
    private UUID eventId = UUID.randomUUID();
    private TransferRequestDTO transRequestDTO;
    private CustomerStatus status;
    private boolean isEventClosed;
    private boolean error;
    private String errorMessage;

    public CustomerEvent() {
    }

    public CustomerEvent(TransferRequestDTO transRequestDTO, boolean error, CustomerStatus status, String errorMessage,
                         boolean isEventClosed) {
        this.transRequestDTO = transRequestDTO;
        this.status = status;
        this.errorMessage = errorMessage;
        this.isEventClosed = isEventClosed;
        this.error = error;
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
    public void setRequestDTO(TransferRequestDTO dto) {

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
    public void setStatus(CustomerStatus status) {
     this.status = status;
    }

    @Override
    public void setEventClosed(boolean isClosed) {

    }


    public TransferRequestDTO getTransRequestDTO() {
        return transRequestDTO;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public boolean isEventClosed() {
        return isEventClosed;
    }

    public boolean isError() {
        return error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return "CustomerEvent{" +
                "eventDate=" + eventDate +
                ", eventId=" + eventId +
                ", transRequestDTO=" + transRequestDTO +
                ", status=" + status +
                ", isEventClosed=" + isEventClosed +
                ", error=" + error +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
