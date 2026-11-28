package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BaseConverterTest {

    BaseConverter converter = new BaseConverter();

    @Test
    void shouldReturnZero_WhenInputIsZero() {
        assertEquals("0", converter.decimalToBinary(0));
    }

    @Test
    void shouldReturnOne_WhenInputIsOne() {
        assertEquals("1", converter.decimalToBinary(1));
    }

    @Test
    void shouldReturnCorrectResult_WhenInputIsValid() {
        assertEquals("1010", converter.decimalToBinary(10));
    }

    @Test
    void shouldReturnBinaryNegative_WhenInputIsNegative() {
        assertEquals("-101", converter.decimalToBinary(-5));
    }

    @Test
    void shouldReturnBinaryNegative_WhenInputIsMinValue() {
        assertEquals("-10000000000000000000000000000000", converter.decimalToBinary(Integer.MIN_VALUE));
    }

    @Test
    void shouldReturnBinary_WhenInputIsMaxValue() {
        assertEquals("1111111111111111111111111111111", converter.decimalToBinary(Integer.MAX_VALUE));
    }
}