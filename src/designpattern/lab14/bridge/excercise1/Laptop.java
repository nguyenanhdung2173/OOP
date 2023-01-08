package designpattern.lab14.bridge.excercise1;

public class Laptop extends Computer{
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startUp() {
        os.startUp();
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
        System.out.println("laptop browsing url: " + url);
    }

    @Override
    public boolean canMoveComputer() {
        return true;
    }
}
