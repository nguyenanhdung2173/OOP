package designpattern.lab12.factory.factorymethod.excercise1.factory;


import designpattern.lab12.factory.factorymethod.excercise1.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
