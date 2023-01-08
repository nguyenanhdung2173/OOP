package designpattern.lab14.bridge.excercise1;

public class WindowsOS implements OperatingSystem{
    @Override
    public void startUp() {
        System.out.println("windowOS starting up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("windowOS loading url");
    }
}
