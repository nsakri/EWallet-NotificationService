package com.example.notification.service;

import com.example.notification.model.NotificationRequest;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void sendMerchantNotification(NotificationRequest request) {
        System.out.println("Merchant notification sent: " + request.getMessage());
    }

    public void sendUserNotification(NotificationRequest request) {
        System.out.println("User notification sent: " + request.getMessage());
    }
}
