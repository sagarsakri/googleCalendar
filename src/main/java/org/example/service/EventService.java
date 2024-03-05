package org.example.service;

import com.sun.xml.internal.ws.client.sei.ResponseBuilder;
import org.example.model.Event;
import org.example.model.User;
import org.example.request.EventRequest;

import javax.xml.ws.Response;
import java.util.List;

public class EventService {

    public void createEvent(Event request) {
        List<User> users = request.getMembers();
        users.add(request.getHost());
        boolean isAvailable = validateEvent(users,request.getStartTime(), request.getEndTime());
        if(!isAvailable) {
            throw new RuntimeException("This event is not available for booking");
        }
        //
        for(User user : users) {
            user.getEventList().add(request);
        }
        System.out.println("The event is created");
    }

    private boolean validateEvent(List<User> users, int startTime, int endTime) {
        for(User user : users) {
            for(Event event : user.getEventList()) {
                if(startTime>= event.getStartTime() && startTime<= event.getEndTime()) {
                    return false;
                }
            }
        }

        return true;
    }


}
