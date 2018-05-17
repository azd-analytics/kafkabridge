package com.allianz.aid.KafkaBridge.config;

import com.allianz.aid.KafkaBridge.stream.RequestsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(RequestsStreams.class)
public class StreamsConfig {
}