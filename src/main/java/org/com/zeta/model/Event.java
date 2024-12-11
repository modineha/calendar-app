package org.com.zeta.model;

public class Event {
    private String eventId;
    private EventType eventType;

    public Event(String eventId, EventType eventType, long startTime, long endTime) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    public String getEventId() {
        return eventId;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    private long startTime; //epoch
    private long endTime;
}
