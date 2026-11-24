package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class InputValidatorTest {

    InputValidator validator = new InputValidator();

    @Test
    void testTuoiDuoiBien17() {
        assertFalse(validator.isValidAge(17));
    }

    @Test
    void testTuoiChamBienDuoi18() {
        assertTrue(validator.isValidAge(18));
    }

    @Test
    void testTuoiHopLeOGiua30() {
        assertTrue(validator.isValidAge(30));
    }

    @Test
    void testTuoiChamBienTren60() {
        assertTrue(validator.isValidAge(60));
    }

    @Test
    void testTuoiVuotBien61() {
        assertFalse(validator.isValidAge(61));
    }

    @Test
    void testTuoiBoTrongNull() {
        assertFalse(validator.isValidAge(null));
    }
}