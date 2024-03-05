package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    String emailId;
    String name;
    String phoneNumber;
    String password;
    List<Event> eventList;

    public User(String emailId, String name, String password) {
        this.emailId = emailId;
        this.name = name;
        this.password = password;
        eventList = new ArrayList<>();
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
