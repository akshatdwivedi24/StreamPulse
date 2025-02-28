package com.finalproject.streampulse.service;

import com.finalproject.streampulse.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private static final String TOPIC = "chat-messages";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(ChatMessage message) {
        kafkaTemplate.send(TOPIC, message.getSender() + ": " + message.getContent());
    }
}
