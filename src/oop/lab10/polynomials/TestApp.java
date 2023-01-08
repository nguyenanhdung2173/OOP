package oop.lab10.polynomials;

import java.util.Arrays;

public class TestApp {
    public static void main(String[] args) {
        Poly arrayPoly = new ArrayPoly(new double[] {1, 3, 4, 8});
        Poly listPoly = new ListPoly(new double[] {1, 3, 4, 8});

        System.out.println(arrayPoly.degree());
        System.out.println(Arrays.toString(arrayPoly.coeficients()));
        System.out.println("ap = " + arrayPoly);
        System.out.println(arrayPoly.derivative());

        System.out.println(listPoly.degree());
        System.out.println(Arrays.toString(listPoly.coeficients()));

        System.out.println("lp = " + listPoly);
        System.out.println(listPoly.derivative());

    }
}
