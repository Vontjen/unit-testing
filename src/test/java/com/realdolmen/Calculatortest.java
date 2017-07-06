package com.realdolmen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vdabcursist on 06/07/2017.
 */
public class Calculatortest {

    public String value;
    Calculator calculator = new Calculator();

    @Test
    public void shouldDisplayOneValue(){
        value = "7";
        assertEquals(7, calculator.evaluate(value));
    }

    @Test
    public void shouldAddTwoValues(){
        value = "7 5";
        assertEquals(12, calculator.evaluate(value));
        value = "4 3";
        assertEquals(7, calculator.evaluate(value));
    }






}
