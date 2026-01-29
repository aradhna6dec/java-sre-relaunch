package com.career.notification_service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    // Ye function Kafka se message sunega aur print karega
    @KafkaListener(topics = "notification-topic", groupId = "group_id")
    public void listen(String message) {
        System.out.println("===========================================");
        System.out.println("📧 EMAIL SERVICE RECEIVED: " + message);
        System.out.println("===========================================");
    }
}