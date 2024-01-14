package ru.skillbox.notification;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SmsNotification implements Notification{
    String message;
    String number;
    @Override
    public String formattedMessage() {
        return "Phone number " + number + "\n" +
                "Message " + message;
    }
}
