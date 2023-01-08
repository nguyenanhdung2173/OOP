package designpattern.lab12.factory.abstractfactory.excercise1.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("you have created MacOSButton");
    }
}
