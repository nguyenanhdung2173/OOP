package oop.homework6.time;

public class TestMyDate {
    public static void main(String[] args) {
//        MyDate date = new MyDate(2012, 2, 28);
//        System.out.println(date);
//        date.nextDay();
//        System.out.println(date);
//        date.nextDay();
//        System.out.println(date);
//        date.nextMonth();
//        System.out.println(date);
//        date.nextYear();
//        System.out.println(date);

        MyDate date2 = new MyDate(2012, 1, 2);
        System.out.println(date2);
        date2.previousDay();
        System.out.println(date2);
        date2.previousDay();
        System.out.println(date2);
        date2.previousMonth();
        System.out.println(date2);
        date2.previousYear();
        System.out.println(date2);
    }
}
