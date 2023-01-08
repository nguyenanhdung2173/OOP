package designpattern.lab12.observer.excercise2;



public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObsever hexaObsever = new HexaObsever(subject);

        System.out.println("Convert decimal 1234");
        subject.setState(1234);

        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hexaObsever);


        System.out.println("convert decimal 5678");
        subject.setState(5678);
        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hexaObsever);

    }
}
