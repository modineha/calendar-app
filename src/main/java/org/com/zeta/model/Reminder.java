package org.com.zeta.model;

public class Reminder extends Event{
    public Reminder(String eventId, EventType eventType, long endTime, long startTime) {
        super(eventId, eventType, endTime, startTime);
    }
}
