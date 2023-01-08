package oop.lab10.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coeficients;

    public ListPoly(double[] coefs) {
        coeficients = new ArrayList<>();
        for (double element : coefs) {
            coeficients.add(element);
        }
    }


    @Override
    public double[] coeficients() {
        double[] out = new double[coeficients.size()];

        for (int i = 0; i < out.length; i++) {
            out[i] = coeficients.get(i);
        }
        return out;
    }

    @Override
    public double coeficient(int i) {
        return coeficients.get(i);
    }

    @Override
    public int degree() {
        return coeficients.size();
    }

    @Override
    public Poly derivative() {
        double[] degreeDiff = new double[degree() - 1];
        for (int i = 0; i < degreeDiff.length; i++) {
            if (coeficients()[i + 1] == 0) {
                degreeDiff[i] = 0;
            } else {
                degreeDiff[i] = coeficients.get(i+1) * (i+1);
            }
        }

        Poly diff = new ListPoly(degreeDiff);
        return diff;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.degree() - 1; i >= 0; i--) {
            description.append(coeficients.get(i))
                    .append("x^")
                    .append(i)
                    .append(" + ");
        }
        description.delete(description.length() - 3, description.length());
        return description.toString();
    }
}
