package oop.lab6.circlecinheritance;

public class TestMain {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(2.0, "blue");
        System.out.println(c1);
        System.out.println("The volume of cylinder is: " + c1.getVolume());
    }
}
