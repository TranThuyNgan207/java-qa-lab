package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ScoreValidatorTest {

    ScoreValidator validator = new ScoreValidator();

    @Test
    void testDiemDuoiBien4() {
        assertFalse(validator.isPassed(4));
    }

    @Test
    void testDiemChamBienDuoi5() {
        assertTrue(validator.isPassed(5));
    }

    @Test
    void testDiemGiua8() {
        assertTrue(validator.isPassed(8));
    }

    @Test
    void testDiemChamBienTren10() {
        assertTrue(validator.isPassed(10));
    }

    @Test
    void testDiemVuotBien11() {
      assertFalse(validator.isPassed(11));
    }

    @Test
    void testDiemBoTrongNull() {
        assertFalse(validator.isPassed(null));
    }
}