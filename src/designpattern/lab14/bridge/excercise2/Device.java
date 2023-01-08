package designpattern.lab14.bridge.excercise2;

public interface Device {
    boolean isEnable();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percent);
    int getChannel();
    void setChannel(int channel);
    void printStatus();
}
