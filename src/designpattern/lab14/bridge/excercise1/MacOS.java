package designpattern.lab14.bridge.excercise1;

public class MacOS implements OperatingSystem{
    @Override
    public void startUp() {
        System.out.println("MacOs starting up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("macOS loading url");
    }
}
