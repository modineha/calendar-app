package org.com.zeta.controller;

import org.com.zeta.model.Event;
import org.com.zeta.model.User;
import org.com.zeta.service.EventService;
import org.com.zeta.service.UserService;

import java.util.Map;

public class EventController
{
    public EventService eventService = new EventService();
    public UserService userService = new UserService();

    public void AddEvent(Integer userId, Event event) {
        Map<Integer, User> userData =  userService.UserData;
        if(userData.containsKey(userId)) {
            eventService.AddEvent(userData.get(userId), event);
        }else{
            System.out.println("User does not exist : so event for this user can't be created");
        }
    }
}
