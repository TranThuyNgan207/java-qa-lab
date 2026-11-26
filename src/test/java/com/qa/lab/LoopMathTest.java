package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class LoopMathTest {

    LoopMath loopMath = new LoopMath();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void testSumBoundaries() {
        assertEquals(0, loopMath.sumToN(0));
        assertEquals(1, loopMath.sumToN(1));
        assertEquals(3, loopMath.sumToN(2));
        assertEquals(5050, loopMath.sumToN(100));
    }

    @Test
    void testNegativeInputThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            loopMath.sumToN(-1);
        });
    }
}