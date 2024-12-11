package org.com.zeta.service;

import org.com.zeta.model.Event;
import org.com.zeta.model.EventType;
import org.com.zeta.model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EventService {

    //map of userId, orgid, eventobject
    Map<Integer, Map<String, Event>> EventMap = new ConcurrentHashMap<>();

    public void AddEvent(User user, Event event)
    {
        if(event.getEventType() == EventType.OneTime)
        {
            AddMeeting(user,event);
        }
        else if(event.getEventType() == EventType.Recurring)
        {

        }
        else{
            System.out.println("Incorrect event type");
        }
    }

    public void AddMeeting(User user, Event event)
    {

    }

    public void AddReminder(User user, Event event)
    {

    }
}
