package com.example.notification.service;

import com.example.notification.model.NotificationRequest;

import com.example.notification.model.NotificationResponse;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public NotificationResponse sendMerchantNotification(NotificationRequest request) {
        if (request == null || request.getMessage() == null || request.getMessage().trim().isEmpty()) {
            return new NotificationResponse(false, "Merchant notification message cannot be empty.");
        }
        System.out.println("Merchant notification sent: " + request.getMessage());
        return new NotificationResponse(true, "Merchant notification sent successfully.");
    }

    public NotificationResponse sendUserNotification(NotificationRequest request) {
        if (request == null || request.getMessage() == null || request.getMessage().trim().isEmpty()) {
            return new NotificationResponse(false, "User notification message cannot be empty.");
        }
        System.out.println("User notification sent: " + request.getMessage());
        return new NotificationResponse(true, "User notification sent successfully.");
    }
}
