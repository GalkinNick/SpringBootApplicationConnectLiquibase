package ru.skillbox.notification;

public class PushNotification implements Notification{

    String emoji = "\uD83D\uDC4B";
    String message;
    String title;
    String account;
    public PushNotification(String Message, String Title, String Account) {
        this.message = Message;
        this.title = Title;
        this.account = Account;
    }

    @Override
    public String formattedMessage() {
        return "account: " + account + "\n" +
                "title: " + title + "\n" +
                "message: " + emoji + message ;
    }
}
