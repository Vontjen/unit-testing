package com.realdolmen;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vdabcursist on 05/07/2017.
 */
public class FractionTest {

    private Fraction f;
    private Fraction g;

    @Before
    public void init(){
        f = new Fraction(1,2);
        g = new Fraction(4,6);
    }


    @Test
    public void shouldSimplify(){
        //Fraction testFrac = new Fraction(25,5)
        assertEquals(2, g.numerator());
        assertEquals(3, g.denominator());

    }

    @Test
    public void shouldCreateFraction(){
        //Fraction f = new Fraction(1,2);
        assertEquals(1,f.numerator());
        assertEquals(2,f.denominator());

    }

    @Test
    public void shouldToString(){
        //Fraction f = new Fraction(2,3);
        assertEquals("2/3",g.toString());
    }

    @Test
    public void shouldAdd(){
        //Fraction f = new Fraction(1,2);
        //Fraction g = new Fraction(2,2);
        Fraction result = f.add(g);
        assertEquals(new Fraction(7,6),result);
    }

    @Test
    public void shouldMuliply(){
        //Fraction f = new Fraction(2,3);
        //Fraction g = new Fraction(6,2);
        Fraction result = f.multiply(g);
        assertEquals(new Fraction(1,3),result);
    }

    //Fractions set in comment because I initialized it in init() method
}
