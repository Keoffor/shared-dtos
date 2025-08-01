package com.kenstudy.event;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Event {
    LocalDateTime eventDate();
    UUID getEventId();

}
