package com.realdolmen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FractionParametrisedTest {

    private Fraction a, b, expectedSum, expectedSubstraction, expectedProduct, expectedDivision;

    public FractionParametrisedTest(Fraction a, Fraction b, Fraction expectedSum, Fraction expectedSubstraction, Fraction expectedProduct, Fraction expectedDivision) {
        this.a = a;
        this.b = b;
        this.expectedSum = expectedSum;
        this.expectedSubstraction = expectedSubstraction;
        this.expectedProduct = expectedProduct;
        this.expectedDivision = expectedDivision;
    }

    @Parameterized.Parameters
    public static Collection<Fraction[]> parameters() {
        return Arrays.asList(new Fraction[][]{
                {
                        new Fraction(1, 2),
                        new Fraction(1, 2),
                        new Fraction(1, 1),
                        new Fraction(0, 1),
                        new Fraction(1, 4),
                        new Fraction(1, 1)},
                {
                        new Fraction(5, 6),
                        new Fraction(4, 10),
                        new Fraction(37, 30),
                        new Fraction(13, 30),
                        new Fraction(1, 3),
                        new Fraction(25, 12)},
                {
                        new Fraction(12, 125),
                        new Fraction(11, 25),
                        new Fraction(67, 125),
                        new Fraction(-43, 125),
                        new Fraction(12 * 11, 125 * 25),
                        new Fraction(12 * 25, 11 * 125)},
                {
                        new Fraction(-5, -2),
                        new Fraction(4, -6),
                        new Fraction(11, 6),
                        new Fraction(19, 6),
                        new Fraction(-5, 3),
                        new Fraction(-15, 4)}
        });
    }


    @Test
    public void shouldAdd() {
        assertEquals(this.expectedSum, (this.a.add(this.b)));
    }

    @Test
    public void shouldSubstract() {
        assertEquals(this.expectedSubstraction, (this.a.subtract(this.b)));
    }

    @Test
    public void shouldMultiply() {
        assertEquals(this.expectedProduct, (this.a.multiply(this.b)));
    }

    @Test
    public void shouldDivide() {
        assertEquals(this.expectedDivision, (this.a.divide(this.b)));
    }
}
