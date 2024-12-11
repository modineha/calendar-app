package org.com.zeta.controller;

import org.com.zeta.service.CalendarService;


public class CalendarController {
    public CalendarService calendarService = new CalendarService();

    public void ViewCalendar(Integer userId, long startTime, long endTime) {
        calendarService.ViewCalendar(userId, startTime, endTime);
    }




}
