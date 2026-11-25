package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DateValidatorTest {

    DateValidator validator = new DateValidator();

    @Test
    void testThang31Ngay() {
        assertEquals(31, validator.daysInMonth(1, 2024));
    }

    @Test
    void testThang30Ngay() {
        assertEquals(30, validator.daysInMonth(4, 2024));
    }

    @Test
    void testThang2NamNhuan2024() {
        assertEquals(29, validator.daysInMonth(2, 2024));
    }

    @Test
    void testThang2TheKyKhongNhuan1900() {
        assertEquals(28, validator.daysInMonth(2, 1900));
    }

    @Test
    void testThang2TheKyNhuan2000() {
        assertEquals(29, validator.daysInMonth(2, 2000));
    }

    @Test
    void testThangDuoiBien0_PhaiBaoLoi() {
        assertThrows(IllegalArgumentException.class, () -> {
            validator.daysInMonth(0, 2024);
        });
    }

    @Test
    void testThangVuotBien13_PhaiBaoLoi() {
        assertThrows(IllegalArgumentException.class, () -> {
            validator.daysInMonth(13, 2024);
        });
    }
}