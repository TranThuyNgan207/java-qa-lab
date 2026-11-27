package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class SafeArrayReaderTest {

    SafeArrayReader reader = new SafeArrayReader();

    @Test
    void testValidIndex() {
        String[] data = {"Java", "SQL", "Git"};
        assertEquals("SQL", reader.getElementSafely(data, 1));
    }

    @Test
    void testNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            reader.getElementSafely(null, 0);
        });
    }

    @Test
    void testEmptyArray() {
        String[] emptyData = new String[0];
        assertThrows(IllegalArgumentException.class, () -> {
            reader.getElementSafely(emptyData, 0);
        });
    }

    @Test
    void testNegativeIndex() {
        String[] data = {"Java", "SQL"};
        assertThrows(IllegalArgumentException.class, () -> {
            reader.getElementSafely(data, -1);
        });
    }

    @Test
    void testIndexEqualLength() {
        String[] data = {"Java", "SQL"}; // length = 2
        assertThrows(IllegalArgumentException.class, () -> {
            reader.getElementSafely(data, 2);
        });
    }
}