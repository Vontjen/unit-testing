package com.realdolmen;

/**
 * Created by vdabcursist on 05/07/2017.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }


    public int numerator() {
        return numerator;
    }

    public int denominator() {
        return denominator;
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }


    private void simplify() {
        if (numerator == 0) {
            denominator = 1;
            return;
        }
        if (denominator < 0) {
            denominator = Math.abs(denominator);
            numerator = -numerator;
        }

        if (denominator == 0) {
            throw new ArithmeticException("Divide by Zero!!!!");
        }

        int factor = Utilities.greatestCommonFactor(numerator, denominator);

        numerator /= factor;
        denominator /= factor;


    }

    public Fraction add(Fraction b) {
        return new Fraction((numerator * b.denominator()) + denominator * b.numerator(), denominator * b.denominator());
    }

    public Fraction subtract(Fraction b) {
        return new Fraction((numerator * b.denominator()) - (denominator) * b.numerator(), denominator * b.denominator());
    }

    public Fraction multiply(Fraction b) {
        return new Fraction((numerator * b.numerator()), denominator * b.denominator());
    }

    public Fraction divide(Fraction b) {
        return this.multiply(b.reciprocal());
    }

    public Fraction reciprocal() {
        return new Fraction(denominator, numerator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (numerator != fraction.numerator) return false;
        return denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }
}
