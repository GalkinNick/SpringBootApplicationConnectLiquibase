package ru.skillbox.notification_sender;

import ru.skillbox.notification.PushNotification;

import java.util.List;

public class PushNotificationSender implements NotificationSender<PushNotification>{
    @Override
    public void send(PushNotification notification) {
        System.out.println(notification.formattedMessage());
    }

    @Override
    public void send(List<PushNotification> notifications) {
        for(int i = 0; i < notifications.size(); i++){
            System.out.println(notifications.get(i).formattedMessage());
        }
    }
}
