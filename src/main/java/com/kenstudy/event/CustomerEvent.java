package com.kenstudy.event;

import com.kenstudy.customer.CustomerRequestDTO;
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
    private String ErrorMessage;

    public CustomerEvent() {
    }

    public CustomerEvent(TransferRequestDTO transRequestDTO, CustomerStatus status, String errorMessage,
                         boolean isEventClosed) {
        this.transRequestDTO = transRequestDTO;
        this.status = status;
        ErrorMessage = errorMessage;
        this.isEventClosed = isEventClosed;
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
     this.ErrorMessage = message;
    }

    @Override
    public void setTStatus(CustomerStatus status) {
     this.status = status;
    }

    @Override
    public void setIsEventClosed(boolean isClosed) {

    }

    public TransferRequestDTO getTransRequestDTO() {
        return transRequestDTO;
    }

    public void setTransRequestDTO(TransferRequestDTO transRequestDTO) {
        this.transRequestDTO = transRequestDTO;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public boolean isEventClosed() {
        return isEventClosed;
    }

    public void setEventClosed(boolean eventClosed) {
        isEventClosed = eventClosed;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }
}
