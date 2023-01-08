package designpattern.lab12.factory.abstractfactory.excercise1.factories;


import designpattern.lab12.factory.abstractfactory.excercise1.buttons.Button;
import designpattern.lab12.factory.abstractfactory.excercise1.buttons.MacOSButton;
import designpattern.lab12.factory.abstractfactory.excercise1.checkboxes.CheckBox;
import designpattern.lab12.factory.abstractfactory.excercise1.checkboxes.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox creatCheckBox() {
        return new MacOSCheckBox();
    }
}
