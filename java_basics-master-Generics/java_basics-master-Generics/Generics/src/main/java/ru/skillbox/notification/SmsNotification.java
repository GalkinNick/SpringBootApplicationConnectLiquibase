package ru.skillbox.notification;

public class SmsNotification implements Notification{
    String message;
    String number;

    public SmsNotification(String Message, String Number){
    this.message = Message;
    this.number = Number;
    }
    @Override
    public String formattedMessage() {
        return "Phone number " + number + "\n" +
                "Message " + message;
    }
}
