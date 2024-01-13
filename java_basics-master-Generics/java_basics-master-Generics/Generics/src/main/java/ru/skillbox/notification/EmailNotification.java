package ru.skillbox.notification;

import java.util.ArrayList;


public class EmailNotification implements Notification{
    String message;
    String subject;
    ArrayList<String> address;
    public EmailNotification(String Message, String Subject, ArrayList<String> Address){
        this.message = Message;
        this.subject = Subject;
        this.address = Address;
    }
    @Override
    public String formattedMessage() {

        return "subject: " + subject + "\n" +
                "address: " + address + "\n" +
                "<p> " + message + " <p>";
    }
}
