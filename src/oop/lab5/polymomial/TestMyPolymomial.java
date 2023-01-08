package oop.lab5.polymomial;

public class TestMyPolymomial {
    public static void main(String[] args) {
        MyPolymomial polymomial1 = new MyPolymomial(1.1, 2.2, 3.3);
        MyPolymomial polymomial2 = new MyPolymomial(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println(polymomial1);
        System.out.println("degree: " + polymomial1.getDegree());
        System.out.println("evaluate x : " + polymomial1.evaluate(1));
        System.out.println(polymomial2);

        double[] coeffs = new double[] {1.2, 3.4, 5.6, 7.8};
        MyPolymomial polymomial3 = new MyPolymomial(coeffs);
        System.out.println(polymomial3);
    }
}
