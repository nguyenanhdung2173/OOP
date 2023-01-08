package oop.lab5.complexnumber;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex number1 = new MyComplex(1.1, 2.2);
        System.out.println(number1);
        System.out.println("number1 is real number : " + number1.isReal());
        System.out.println("number1 is imaginary number: " + number1.isImaginary());

        MyComplex number2 = new MyComplex(3.3, 4.4);
        System.out.println(number2);
        System.out.println("number1 is real number : " + number2.isReal());
        System.out.println("number1 is imaginary number: " + number2.isImaginary());

        System.out.println("Number1 is equal number2: " + number1.equals(number2));

        System.out.println(number1.addInto(number2));
    }
}
