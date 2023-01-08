package oop.lab5.complexnumber;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.real)
                .append("+")
                .append(this.imag)
                .append("i");
        return str.toString();
    }

    public boolean isReal() {
        if (Double.compare(this.imag, 0.0) == 0) {
            return true;
        }
        return false;
    }

    public boolean isImaginary() {
        if (Double.compare(this.real, 0.0) == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(double real, double imag) {
        if (Double.compare(this.real, real) == 0
                && Double.compare(this.imag, imag) == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex another) {
        if (Double.compare(this.real, another.real) == 0
                && Double.compare(this.imag, another.real) == 0) {
            return true;
        }
        return false;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.setReal(this.real + right.real);
        newComplex.setImag(this.imag + right.imag);
        return newComplex;
    }
}
