package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BaseConverterTest {

    BaseConverter converter = new BaseConverter();

    @Test
    void testZero() {
        assertEquals("0", converter.decimalToBinary(0));
    }

    @Test
    void testOne() {
        assertEquals("1", converter.decimalToBinary(1));
    }

    @Test
    void testPositiveNumber() {
        assertEquals("1010", converter.decimalToBinary(10));
    }

    @Test
    void testNegativeNumber() {
        assertEquals("-101", converter.decimalToBinary(-5));
    }

    @Test
    void testMinValueOverflow() {
        assertEquals("-10000000000000000000000000000000", converter.decimalToBinary(Integer.MIN_VALUE));
    }

    @Test
    void testMaxValue() {
        assertEquals("1111111111111111111111111111111", converter.decimalToBinary(Integer.MAX_VALUE));
    }
}