package com.kenstudy.event;

import com.kenstudy.customer.CustomerRequestDTO;
import com.kenstudy.event.status.CustomerStatus;
import com.kenstudy.transaction.TransferRequestDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public class CustomerEvent implements Event{
    private LocalDateTime eventDate = LocalDateTime.now();
    private UUID eventId = UUID.randomUUID();
    private TransferRequestDTO transRequestDTO;
    private CustomerStatus status;
    private String ErrorMessage;

    public CustomerEvent() {
    }

    public CustomerEvent(TransferRequestDTO transRequestDTO, CustomerStatus status, String errorMessage) {
        this.transRequestDTO = transRequestDTO;
        this.status = status;
        ErrorMessage = errorMessage;
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

    public void setTransRequestDTO(TransferRequestDTO transRequestDTO) {
        this.transRequestDTO = transRequestDTO;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }
}
