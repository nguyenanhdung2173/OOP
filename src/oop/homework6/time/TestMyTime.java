package oop.homework6.time;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(0,0,0);
        System.out.println(t1);
        t1.nextSecond();
        System.out.println(t1);
        t1.nextMinute();
        System.out.println(t1);
        t1.nextHour();
        System.out.println(t1);
        t1.previousSecond();
        System.out.println(t1);
        t1.previousMinute();
        System.out.println(t1);
        t1.previousHour();
        System.out.println(t1);
    }
}
