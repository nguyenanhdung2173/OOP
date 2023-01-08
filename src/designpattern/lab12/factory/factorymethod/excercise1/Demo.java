package designpattern.lab12.factory.factorymethod.excercise1;


import designpattern.lab12.factory.factorymethod.excercise1.factory.Dialog;
import designpattern.lab12.factory.factorymethod.excercise1.factory.HtmlDialog;
import designpattern.lab12.factory.factorymethod.excercise1.factory.WindowDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("window 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
