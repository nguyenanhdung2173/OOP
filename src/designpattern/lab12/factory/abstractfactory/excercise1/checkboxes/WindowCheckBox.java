package designpattern.lab12.factory.abstractfactory.excercise1.checkboxes;

public class WindowCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("you have created WindowCheckBox.");
    }
}
