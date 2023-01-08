package designpattern.lab12.factory.abstractfactory.excercise1.buttons;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("you have created WindowButton");
    }
}
