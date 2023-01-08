package designpattern.lab12.factory.factorymethod.excercise1.buttons;

public class HtmlButton implements Button{

    @Override
    public void render() {
        System.out.println("<button> test Button </button>");
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'hello world!'");
    }
}
