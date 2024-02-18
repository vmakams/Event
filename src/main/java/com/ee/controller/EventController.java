package com.ee.controller;

import com.ee.dto.request.DeleteEventRequest;
import com.ee.dto.request.EventRequest;
import com.ee.dto.request.EventResponse;
import com.ee.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("create")
    public ResponseEntity<String> createEvent(@Valid @RequestBody EventRequest eventRequest) {

        return ResponseEntity.ok().body(eventService.createEvent(eventRequest));
    }

    @GetMapping("events")
    public List<EventResponse> getAllEvents() {

        return eventService.getAllEvents();

    }

    @GetMapping("events/{email}")
    public List<EventResponse> getEventsById(@PathVariable String email) {
        return eventService.getAllEventsById(email);
    }


    @DeleteMapping("delete")
    public String deleteEvent(@RequestBody DeleteEventRequest deleteEventRequest) {

        return eventService.deleteEvent(deleteEventRequest);

    }


}
