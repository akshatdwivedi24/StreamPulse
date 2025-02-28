package com.finalproject.streampulse.repository.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "chat-messages", groupId = "chat-group")
    public void consumeMessage(String message) {
        System.out.println("Received: " + message);
    }
}
