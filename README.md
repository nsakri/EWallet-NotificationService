# Notification Service

This is a Spring Boot microservice for sending notifications after payment.

## Features
- Exposes `/notify` endpoint
- Sends merchant notification
- Sends user notification

## How to Run

1. Ensure you have Java 17+ and Maven installed.
2. Build the project:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## API

### POST /notify
Send notification after payment.

#### Request Body
```
{
  "userId": "string",
  "merchantId": "string",
  "paymentId": "string",
  "message": "string"
}
```

#### Response
- 200 OK: Notification sent
- 400 Bad Request: Invalid input

Replace placeholders as needed for your use case.