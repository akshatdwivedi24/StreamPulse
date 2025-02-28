package com.finalproject.streampulse.controller;

import com.finalproject.streampulse.model.ChatMessage;
import com.finalproject.streampulse.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
@CrossOrigin(origins = "*")
public class ChatController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody ChatMessage chatMessage) {
        kafkaProducerService.sendMessage(chatMessage);
        return "Message sent!";
    }
}
