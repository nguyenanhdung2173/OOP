package designpattern.lab12.factory.abstractfactory.excercise1.factories;


import designpattern.lab12.factory.abstractfactory.excercise1.buttons.Button;
import designpattern.lab12.factory.abstractfactory.excercise1.buttons.WindowsButton;
import designpattern.lab12.factory.abstractfactory.excercise1.checkboxes.CheckBox;
import designpattern.lab12.factory.abstractfactory.excercise1.checkboxes.WindowCheckBox;

public class WindowFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox creatCheckBox() {
        return new WindowCheckBox();
    }
}
