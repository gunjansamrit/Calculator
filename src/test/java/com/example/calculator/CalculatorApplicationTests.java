package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
class CalculatorApplicationTests {
    @Test
    public void testSquareRoot() {
        assertEquals(4.0, CalculatorApplication.squareRoot(16), 0.001);
        assertEquals(5.0, CalculatorApplication.squareRoot(25), 0.001);
        assertEquals(0.0, CalculatorApplication.squareRoot(0), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, CalculatorApplication.factorial(0));
        assertEquals(1, CalculatorApplication.factorial(1));
        assertEquals(120, CalculatorApplication.factorial(5));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(1.609, CalculatorApplication.naturalLogarithm(5), 0.001);
        assertEquals(0.0, CalculatorApplication.naturalLogarithm(1), 0.001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, CalculatorApplication.power(2, 3), 0.001);
        assertEquals(16.0, CalculatorApplication.power(4, 2), 0.001);
        assertEquals(1.0, CalculatorApplication.power(10, 0), 0.001);
    }

}
