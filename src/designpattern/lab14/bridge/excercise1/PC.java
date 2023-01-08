package designpattern.lab14.bridge.excercise1;

public class PC extends Computer{
    public PC(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startUp() {
        os.startUp();
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
        System.out.println("Pc browsing url: " + url);
    }

    @Override
    public boolean canMoveComputer() {
        return false;
    }
}
