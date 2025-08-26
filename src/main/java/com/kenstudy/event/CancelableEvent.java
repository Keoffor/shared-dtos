package com.kenstudy.event;

public interface CancelableEvent<D, S> {
    void setRequestDTO(D dto);
    void setErrorMessage(String message);
    void setError(boolean isError);
    void setStatus(S status);
    void setEventClosed(boolean isClosed);


}
