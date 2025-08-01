package com.kenstudy.event;

import com.kenstudy.event.status.TransStatus;
import com.kenstudy.transaction.TransferRequestDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public class TransactEvent implements Event{
    private LocalDateTime eventDate = LocalDateTime.now();
    private UUID eventId = UUID.randomUUID();
    private TransferRequestDTO transRequestDTO;
    private String errorMessage;
    private TransStatus transStatus;

    public TransactEvent() {
    }

    public TransactEvent(TransferRequestDTO transRequestDTO, TransStatus transStatus, String errorMessage) {
        this.transRequestDTO = transRequestDTO;
        this.errorMessage = errorMessage;
        this.transStatus = transStatus;
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

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public TransStatus getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(TransStatus transStatus) {
        this.transStatus = transStatus;
    }
}
