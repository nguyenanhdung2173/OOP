package designpattern.lab12.observer.excercise2;

public class HexaObsever extends Observer{
    private String hexa;

    public HexaObsever(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    @Override
    public void update() {
        hexa = covertDecimalToHexa(subject.getState());
    }

    private String covertDecimalToHexa(int decimal) {
        return Integer.toHexString(decimal);
    }

    @Override
    public String toString() {
        return this.hexa;
    }
}
