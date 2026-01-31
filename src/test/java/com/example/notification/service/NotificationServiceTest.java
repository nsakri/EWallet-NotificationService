package com.example.notification.service;

import com.example.notification.model.NotificationRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {
    private NotificationService notificationService;
    private NotificationRequest request;

    @BeforeEach
    void setUp() {
        notificationService = new NotificationService();
        request = new NotificationRequest();
        request.setUserId("user1");
        request.setMerchantId("merchant1");
        request.setPaymentId("payment1");
        request.setMessage("Payment successful");
    }

    @Test
    void testSendMerchantNotification() {
        assertDoesNotThrow(() -> notificationService.sendMerchantNotification(request));
    }

    @Test
    void testSendUserNotification() {
        assertDoesNotThrow(() -> notificationService.sendUserNotification(request));
    }
}
