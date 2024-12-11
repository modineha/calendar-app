package org.com.zeta;

import org.com.zeta.controller.CalendarController;
import org.com.zeta.controller.EventController;
import org.com.zeta.controller.OrgController;
import org.com.zeta.controller.UserController;

import org.com.zeta.model.Event;
import org.com.zeta.model.EventType;
import org.com.zeta.model.Permission;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static OrgController orgController = new OrgController();
    static UserController userController = new UserController();
    static CalendarController calendarController = new CalendarController();
    static EventController eventController = new EventController();
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello zeta Calendar service!");

        CreateOrganization();
        AddUserData();
        //Event eventForUser1 = new Event("e1", EventType.OneTime, )
        //AddEvent()
        ViewCalendar(1, 1733918065, 1733921665);
    }

    private static void ViewCalendar(int userId, long start, long end) {
        calendarController.ViewCalendar(userId, start, end);
    }

    private static void CreateOrganization() {
        orgController.AddOrg("1", "org1");
        orgController.AddOrg("2", "org2");
        orgController.AddOrg("3", "org3");
    }

    private static void AddUserData() {
        userController.AddUser(1, "neha", "1", Permission.write);
        userController.AddUser(2, "nm", "1", Permission.write);
        userController.AddUser(3, "qwerty", "1", Permission.write);
    }

    private static void AddEvent(int userId, Event event)
    {
        eventController.AddEvent(userId, event);
    }
}