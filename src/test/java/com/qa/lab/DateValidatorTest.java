package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DateValidatorTest {

    DateValidator validator = new DateValidator();

    @Test
    void shouldReturn31_WhenJan2024() {
        assertEquals(31, validator.daysInMonth(1, 2024));
    }

    @Test
    void shouldReturn30_WhenApr2024() {
        assertEquals(30, validator.daysInMonth(4, 2024));
    }

    @Test
    void shouldReturn29_WhenFeb2024() {
        assertEquals(29, validator.daysInMonth(2, 2024));
    }

    @Test
    void shouldReturn28_WhenFeb1900() {
        assertEquals(28, validator.daysInMonth(2, 1900));
    }

    @Test
    void shouldReturn29_WhenFeb2000() {
        assertEquals(29, validator.daysInMonth(2, 2000));
    }

    @Test
    void shouldThrowException_WhenMonthIsZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            validator.daysInMonth(0, 2024);
        });
    }

    @Test
    void shouldThrowException_WhenMonthIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            validator.daysInMonth(13, 2024);
        });
    }
}