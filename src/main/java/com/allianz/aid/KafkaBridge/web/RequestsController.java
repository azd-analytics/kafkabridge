package com.allianz.aid.KafkaBridge.web;

import com.allianz.aid.KafkaBridge.model.Requests;
import com.allianz.aid.KafkaBridge.service.RequestsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController; 
@RestController
public class RequestsController {
    private final RequestsService requestsService;
    public RequestsController(RequestsService requestsService) {
        this.requestsService = requestsService;
    }
    @GetMapping("/requests")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void requests(@RequestParam("message") String message) {
        Requests requests = Requests.builder()
            .message(message)
            .timestamp(System.currentTimeMillis())
            .build();
        requestsService.sendGreeting(requests);
    }
}