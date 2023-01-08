package designpattern.lab12.observer.excercise1.listener;

import java.io.File;

public class LogOpenLIstener implements EventListener{
    private File log;

    public LogOpenLIstener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log: " + log + ": Someone has performed " + eventType + "operation with the following file: " + file.getName());
    }
}
