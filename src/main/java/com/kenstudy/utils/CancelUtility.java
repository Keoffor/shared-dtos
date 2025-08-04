package com.kenstudy.utils;

import com.kenstudy.event.CancelableEvent;

import java.util.logging.Logger;

public class CancelUtility {
    private static final Logger log = Logger.getLogger(String.valueOf(CancelUtility.class));


    public static <E extends CancelableEvent<D, S>, D, S> E cancelEventUtility(E event, D dto, String reason, S failure)
    {
        log.info("Cancelling event due to: "+ reason);
        event.setRequestDTO(dto);
        event.setErrorMessage(reason);
        event.setTStatus(failure);
        event.setIsEventClosed(true);
        return event;
    }
}
