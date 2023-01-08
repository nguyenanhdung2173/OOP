package designpattern.lab12.factory.abstractfactory.excercise1.checkboxes;

public class MacOSCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("you have created MacOSCheckBox.");
    }
}
