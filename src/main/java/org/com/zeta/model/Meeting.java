package org.com.zeta.model;

public class Meeting extends Event{
    public Meeting(String eventId, EventType eventType, long endTime, long startTime) {
        super(eventId, eventType, endTime, startTime);
    }
}
