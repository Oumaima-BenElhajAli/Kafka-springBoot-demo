package com.oumaimaBha.producer.rest;

import com.oumaimaBha.producer.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/wikimedia")
public class WikimediaController {
    private final WikimediaStreamConsumer consumer;

    @GetMapping
    public void startPublishing(){
        consumer.consumeStreamAndPublish();
    }
}
