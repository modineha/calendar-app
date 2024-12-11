package org.com.zeta.service;

import org.com.zeta.model.Event;

import java.util.HashMap;
import java.util.Map;


public class CalendarService
{

    public void ViewCalendar(int userid, long startTime, long endTime)
    {
        Map<String, Event> EventDataInTimeFrame = GetEventData(userid, startTime, endTime);
        if(EventDataInTimeFrame.isEmpty())
        {
            System.out.println("no meeting/no reminder for this user");
        }
        else{
            for(Map.Entry<String, Event> entry : EventDataInTimeFrame.entrySet())
            {
                System.out.println("event starts from : " + entry.getValue().getStartTime() + " to " + entry.getValue().getEndTime());
            }
        }
    }

    public  Map<String, Event> GetEventData(Integer userId, long startTime, long endTime)
    {
        //event id and event data
        Map<String, Event> requiredEventData = new HashMap();
        EventService eventService = new EventService();
        Map<Integer, Map<String, Event>> EventMap = eventService.EventMap;
        if(EventMap.containsKey(userId))
        {
            Map<String, Event> eventMap = EventMap.get(userId);
            for(Event event : eventMap.values())
            {
                if(event.getStartTime() >= startTime && event.getEndTime() <= endTime)
                {
                    requiredEventData.put(event.getEventId(), event);
                }
            }
            return requiredEventData;
        }else{
            System.out.println("no meeting/no reminder for this user");
            return requiredEventData;
        }
    }
}
