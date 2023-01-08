package oop.lab10.polynomials;

public class ArrayPoly extends AbstractPoly{
    private  double[] coeficients;

    public ArrayPoly(double[] coeficients) {
        this.coeficients = new double[coeficients.length];
        for (int i = 0; i < coeficients.length; i++) {
            this.coeficients[i] = coeficients[i];
        }
    }
    @Override
    public double[] coeficients() {return coeficients;
    }

    @Override
    public double coeficient(int i) {
        return coeficients[i];
    }

    @Override
    public int degree() {
        return coeficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] degreeDiff = new double[degree()];
        for (int i = 0; i < degreeDiff.length; i++) {
            if (coeficients()[i + 1] == 0) {
                degreeDiff[i] = 0;
            } else {
                degreeDiff[i] = coeficients[(i+1)] * (i+1);
            }
        }


        Poly diff = new ArrayPoly(degreeDiff);
        return diff;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.degree(); i >= 0; i--) {
            description.append(this.coeficients[i])
                    .append("x^")
                    .append(i)
                    .append(" + ");
        }
        description.delete(description.length() - 3, description.length());
        return description.toString();
    }
}
