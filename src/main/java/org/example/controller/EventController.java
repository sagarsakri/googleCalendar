package org.example.controller;

import org.example.model.Event;
import org.example.request.EventRequest;
import org.example.service.EventService;

import javax.xml.ws.Response;

public class EventController {
    //    CreateEvent
//            UpdateEvent
//    DeleteEvent
//            GetDetailsOfEventById
//    GetAllEvents - who is calling ?
    EventService service = new EventService();
    public void createEvent(Event request){

        try {
            service.createEvent(request);
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
