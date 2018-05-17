package com.allianz.aid.KafkaBridge.service;

import com.allianz.aid.KafkaBridge.model.Requests;
import com.allianz.aid.KafkaBridge.stream.RequestsStreams;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class RequestsService {
    private final RequestsStreams requestsStreams;
    public RequestsService(RequestsStreams requestsStreams) {
        this.requestsStreams = requestsStreams;
    }
    public void sendGreeting(final Requests requests) {
        log.info("Sending requests {}", requests);
        MessageChannel messageChannel = requestsStreams.outboundRequests();
        messageChannel.send(MessageBuilder
                .withPayload(requests)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}