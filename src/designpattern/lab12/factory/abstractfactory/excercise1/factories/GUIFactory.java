package designpattern.lab12.factory.abstractfactory.excercise1.factories;


import designpattern.lab12.factory.abstractfactory.excercise1.buttons.Button;
import designpattern.lab12.factory.abstractfactory.excercise1.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox creatCheckBox();
}
