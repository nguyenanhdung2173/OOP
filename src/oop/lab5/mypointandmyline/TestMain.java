package oop.lab5.mypointandmyline;

public class TestMain {
    public static void main(String[] args) {
        MyLine myLine = new MyLine(0, 0, 3, 3);
        System.out.println(myLine);
        System.out.println("length is: " + myLine.getLength());
        System.out.println("gradient is: " + myLine.getGradient());

        myLine.setBeginX(1);
        myLine.setBeginY(2);
        myLine.setEndX(3);
        myLine.setEndY(6);
        System.out.println(myLine);
        System.out.println("length is: " + myLine.getLength());
        System.out.println("gradient is: " + myLine.getGradient());
    }
}
