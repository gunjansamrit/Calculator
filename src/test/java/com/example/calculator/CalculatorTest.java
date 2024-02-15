package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Calculator.squareRoot(16), 0.001);
        assertEquals(5.0, Calculator.squareRoot(25), 0.001);
        assertEquals(0.0, Calculator.squareRoot(0), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Calculator.factorial(0));
        assertEquals(1, Calculator.factorial(1));
        assertEquals(120, Calculator.factorial(5));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(1.609, Calculator.naturalLogarithm(5), 0.001);
        assertEquals(0.0, Calculator.naturalLogarithm(1), 0.001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Calculator.power(2, 3), 0.001);
        assertEquals(16.0, Calculator.power(4, 2), 0.001);
        assertEquals(1.0, Calculator.power(10, 0), 0.001);
    }
}
