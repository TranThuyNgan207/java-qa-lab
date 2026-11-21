package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testCongHaiSo() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testTruHaiSo() {
        assertEquals(6, calc.subtract(10, 4));
    }

    @Test
    void testSoChan() {
        assertTrue(calc.isEven(8));
    }

    @Test
    void testSoLe() {
        assertFalse(calc.isEven(7));
    }

    @Test
    void testChiaChoKhong() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}