package designpattern.lab12.observer.excercise1.listener;

import java.io.File;

public class EmailNotificationListener implements EventListener{
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed" + eventType + "operation with the followin file: " + file.getName());
    }
}
