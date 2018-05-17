package com.allianz.aid.KafkaBridge.service;

import com.allianz.aid.KafkaBridge.model.Requests;
import com.allianz.aid.KafkaBridge.stream.RequestsStreams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
@Component
@Slf4j
public class RequestsListener {
    @StreamListener(RequestsStreams.INPUT)
    public void handleRequests(@Payload Requests requests) {
        log.info("Received requests: {}", requests);
    }
}