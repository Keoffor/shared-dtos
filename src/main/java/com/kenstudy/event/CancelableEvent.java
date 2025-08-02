package com.kenstudy.event;

public interface CancelableEvent<D, S> {
    void setRequestDTO(D dto);
    void setErrorMessage(String message);
    void setTStatus(S status);
    void setIsEventClosed(boolean isClosed);


}
