package ru.skillbox.notification;

import lombok.AllArgsConstructor;

import java.beans.ConstructorProperties;
import java.util.ArrayList;


@AllArgsConstructor
public class EmailNotification implements Notification{
   private String message;
    private String subject;
    private ArrayList<String> address;
    @Override
    public String formattedMessage() {

        return "subject: " + subject + "\n" +
                "address: " + address + "\n" +
                "<p> " + message + " <p>";
    }
}
