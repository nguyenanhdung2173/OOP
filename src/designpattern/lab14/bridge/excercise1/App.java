package designpattern.lab14.bridge.excercise1;

public class App {
    public static void main(String[] args) {
        OperatingSystem WindowOs = new WindowsOS();
        OperatingSystem MacOS = new MacOS();

        Computer laptop = new Laptop(WindowOs);
        Computer laptop2 = new Laptop(MacOS);
        laptop.startUp();
        laptop.browseInternet("google.com");

        laptop2.startUp();
        laptop2.browseInternet("google.com");

        Computer PC = new PC(MacOS);
        System.out.println("can PC move ? : " + PC.canMoveComputer());
    }
}
