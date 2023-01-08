package designpattern.lab12.observer.excercise2;

public abstract class Observer {
    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    public abstract void update();
}
