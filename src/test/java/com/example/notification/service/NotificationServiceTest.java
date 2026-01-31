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
        var response = notificationService.sendMerchantNotification(request);
        assertNotNull(response);
        assertTrue(response.isSuccess());
        assertEquals("Merchant notification sent successfully.", response.getMessage());
    }

    @Test
    void testSendUserNotification() {
        var response = notificationService.sendUserNotification(request);
        assertNotNull(response);
        assertTrue(response.isSuccess());
        assertEquals("User notification sent successfully.", response.getMessage());
    }
}
