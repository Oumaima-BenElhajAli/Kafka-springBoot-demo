package com.oumaimaBha.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {
    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void receiveMessage(String message){
        log.info( String.format("Receiving msg from wikimedia-stream Topic:: %s", message));
    }
}
