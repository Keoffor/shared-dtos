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
    private boolean isEventClosed;

    public TransactEvent() {
    }

    public TransactEvent(TransferRequestDTO transRequestDTO, TransStatus transStatus, String errorMessage,
                        boolean isEventClosed) {
        this.transRequestDTO = transRequestDTO;
        this.errorMessage = errorMessage;
        this.transStatus = transStatus;
        this.isEventClosed= isEventClosed;
    }


    @Override
    public void setRequestDTO(TransferRequestDTO dto) {
        this.transRequestDTO = dto;
    }

    @Override
    public void setErrorMessage(String message) {

    }

    @Override
    public void setTStatus(TransStatus status) {
     this.transStatus = status;
    }

    @Override
    public void setIsEventClosed(boolean isClosed) {
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

    public void setTransRequestDTO(TransferRequestDTO transRequestDTO) {
        this.transRequestDTO = transRequestDTO;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public TransStatus getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(TransStatus transStatus) {
        this.transStatus = transStatus;
    }

    public boolean isEventClosed() {
        return isEventClosed;
    }

    public void setEventClosed(boolean eventClosed) {
        isEventClosed = eventClosed;
    }
}
