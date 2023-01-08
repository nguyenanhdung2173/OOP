package oop.lab5.polymomial;

public class MyPolymomial {
    private double[] coeffs;

    public MyPolymomial(double ... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.getDegree(); i >= 0; i--) {
            description.append(coeffs[i])
                    .append("x^")
                    .append(i)
                    .append(" + ");
        }
        description.delete(description.length() - 6, description.length());
        return description.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0;
        for (int i = this.getDegree(); i >=0; i--){
            polyValue = polyValue * x + this.coeffs[i];
        }
        return  polyValue;
    }

    public MyPolymomial add(MyPolymomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] addPolyData = new double[maxDegree];
        // add this poly to addPoly
        for (int i = 0; i < addPolyData.length; i++) {
            addPolyData[i] = this.coeffs[i];
        }
        // add rightPoly to addPoly
        for (int i = 0; i < addPolyData.length; i++) {
            addPolyData[i] = right.coeffs[i];
        }

        MyPolymomial addPoly = new MyPolymomial(addPolyData);
        return  addPoly;
    }

    public MyPolymomial multiply(MyPolymomial right) {
        int multiPolyDegree = this.getDegree() + right.getDegree();
        double[] multiPolyData = new double[multiPolyDegree];
        // cong thuc tich chap
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree() ; j++) {
                multiPolyData[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        MyPolymomial multiPoly = new MyPolymomial(multiPolyData);
        return multiPoly;
    }
}
