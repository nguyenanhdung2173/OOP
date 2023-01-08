package designpattern.lab12.factory.abstractfactory.excercise1.app;


import designpattern.lab12.factory.abstractfactory.excercise1.factories.GUIFactory;
import designpattern.lab12.factory.abstractfactory.excercise1.factories.MacOSFactory;
import designpattern.lab12.factory.abstractfactory.excercise1.factories.WindowFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            guiFactory = new MacOSFactory();
        } else {
            guiFactory = new WindowFactory();
        }

        app = new Application(guiFactory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
