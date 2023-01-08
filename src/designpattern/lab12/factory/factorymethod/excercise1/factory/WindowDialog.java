package designpattern.lab12.factory.factorymethod.excercise1.factory;


import designpattern.lab12.factory.factorymethod.excercise1.buttons.Button;
import designpattern.lab12.factory.factorymethod.excercise1.buttons.WindowsButton;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
