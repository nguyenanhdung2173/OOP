package oop.lab10.polynomials;

public interface Poly {
    double[] coeficients();
    double coeficient(int i);
    int degree();
    Poly derivative();
}
