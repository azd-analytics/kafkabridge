package com.allianz.aid.KafkaBridge.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;  
public interface RequestsStreams {
    String INPUT = "requests-in";
    String OUTPUT = "requests-out";
    @Input(INPUT)
    SubscribableChannel inboundRequests();
    @Output(OUTPUT)
    MessageChannel outboundRequests();
}