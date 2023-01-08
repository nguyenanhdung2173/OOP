package designpattern.lab12.observer.excercise1;
import designpattern.lab12.observer.excercise1.listener.EmailNotificationListener;
import designpattern.lab12.observer.excercise1.listener.LogOpenLIstener;
import designpattern.lab12.observer.excercise1.editor.Editor;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenLIstener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("text.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
