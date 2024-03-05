package org.example;

import org.example.controller.EventController;
import org.example.model.Event;
import org.example.model.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1@gmail.com", "user1", "123");
        User user2 = new User("user2@gmail.com", "user2", "123");
        User user3 = new User("user3@gmail.com", "user3", "123");
        User user4 = new User("user4@gmail.com", "user4", "123");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);


        Event event = new Event();
        event.setEventId("1");
        event.setDescription("event description");
        event.setEventName("Event 1");
        event.setHost(user1);
        event.getMembers().add(user2);
        event.getMembers().add(user3);
        event.getMembers().add(user4);
        event.setStartTime(11);
        event.setEndTime(13);

        EventController eventController = new EventController();
        eventController.createEvent(event); // event created


        Event event1 = new Event();
        event1.setEventId("2");
        event1.setDescription("event description");
        event1.setEventName("Event 2");
        event1.setHost(user1);
        event1.getMembers().add(user2);
        event1.getMembers().add(user3);
        event1.getMembers().add(user4);
        event1.setStartTime(12);
        event1.setEndTime(13);

        eventController.createEvent(event1);// get an exception

    }
    // satyammishra2508@gmail.com
}