package oop.lab10.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    public AbstractPoly() {}

    public double[] derive() {
        return coeficients();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        AbstractPoly poly = (AbstractPoly) o;
        return poly.coeficients() == this.coeficients() && poly.degree() == this.degree();
    }

    public int hashCode() {
        return Objects.hashCode(coeficients());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
