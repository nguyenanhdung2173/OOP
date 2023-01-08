package designpattern.lab12.observer.excercise1.listener;
import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
