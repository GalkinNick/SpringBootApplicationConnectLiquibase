package ru.skillbox.notification;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PushNotification implements Notification{


    private String message;
    private String title;
    private String account;
    private final String emoji = "\uD83D\uDC4B";
    @Override
    public String formattedMessage() {
        return "account: " + account + "\n" +
                "title: " + title + "\n" +
                "message: " + emoji + message ;
    }
}
