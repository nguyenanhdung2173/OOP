package oop.homework6.time;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("\"%02d:%02d:%02d\"", this.hour,this.minute, this.second);
    }

    public MyTime nextSecond() {
        this.second += 1;
        if (this.second >= 60) {
            this.minute += 1;
            this.second = 0;
        }
        if (this.minute >= 60) {
            hour += 1;
            this.minute = 0;
        }

        if (this.hour >= 24) {
            this.hour = 0;
        }

        return this;
    }

    public MyTime nextMinute() {
        this.minute += 1;
        if (this.minute >= 60) {
            this.hour += 1;
            this.minute = 0;
        }
        if (this.hour >= 24) {
            this.hour = 0;
        }

        return this;
    }

    public MyTime nextHour() {
        this.hour += 1;
        if (this.hour >= 24) {
            this.hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        this.second -= 1;
        if (this.second < 0) {
            this.minute -= 1;
            this.second = 59;
        }

        if (this.minute < 0) {
            this.hour -= 1;
            this.minute = 59;
        }

        if (this.hour < 0) {
            this.hour = 23;
        }

        return this;
    }

    public MyTime previousMinute() {
        this.minute -= 1;
        if (this.minute < 0) {
            this.hour -= 1;
            this.minute = 59;
        }

        if (this.hour < 0) {
            this.hour = 23;
        }
        return this;
    }

    public MyTime previousHour() {
        this.hour -= 1;
        if (this.hour < 0) {
            this.hour = 23;
        }

        return this;
    }
}
