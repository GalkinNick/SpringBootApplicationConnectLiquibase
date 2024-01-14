package ru.skillbox.notification_sender;

import ru.skillbox.notification.Notification;
import ru.skillbox.notification.SmsNotification;

import java.util.List;

public class SmsNotificationSender implements NotificationSender<SmsNotification>{
    @Override
    public void send(SmsNotification notification) {
        System.out.println(notification.formattedMessage());
    }

    @Override
    public void send(List<SmsNotification> notifications) {
        for(int i = 0; i < notifications.size(); i++){
            System.out.println(notifications.get(i).formattedMessage());

        }
    }
}
