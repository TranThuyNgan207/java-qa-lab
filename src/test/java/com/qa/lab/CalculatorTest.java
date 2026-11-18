package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testCongHaiSo() {
        int ketQua = 1 + 1;
        assertEquals(2, ketQua);
    }
}