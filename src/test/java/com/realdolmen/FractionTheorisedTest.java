package com.realdolmen;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

@RunWith(Theories.class)
public class FractionTheorisedTest {

    @Theory
    public void invertedIsUpsideDown(Fraction f) {
        assumeTrue(f.numerator() != 0 && f.denominator() != 0);
        assertTrue(f.reciprocal().equals(new Fraction(f.denominator(), f.numerator())));
    }

    @DataPoints
    public static Fraction[] fractions = {
            new Fraction(2, 3),
            new Fraction(5, 7),
            new Fraction(7, 15),
            new Fraction(-7, -5),
            new Fraction(3, 4),
            new Fraction(17, -25),
            new Fraction(14, 12)

    };

    @DataPoints
    public static Fraction f = new Fraction(0, 0);
}
