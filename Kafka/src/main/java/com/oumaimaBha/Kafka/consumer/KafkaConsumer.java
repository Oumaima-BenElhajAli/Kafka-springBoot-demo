package com.oumaimaBha.Kafka.consumer;

import com.oumaimaBha.Kafka.payload.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumer {
//    @KafkaListener(topics = "firstTopic", groupId = "myGroup")
//    public void receiveMessage(String message){
//        log.info( String.format("Receiving msg from firstTopic:: %s", message));
//    }
    @KafkaListener(topics = "firstTopic", groupId = "myGroup")
    public void receiveJsonMessage(Student student){
        log.info( String.format("Receiving msg from firstTopic:: %s", student.toString()));

    }
}
