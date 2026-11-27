package com.qa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class BuggyLabTest{
	
	BuggyLab lab = new BuggyLab();
	
	@Test
	void testDefect01_CenturyNonLeapYear() {
		assertEquals(28, lab.daysInMonth(2, 1900));
	}
	@Test
    void testDefect02_SumToOne() {
        assertEquals(1, lab.sumToN(1));
    }

    @Test
    void testDefect03_IndexEqualLength() {
        String[] items = {"Java", "SQL"};
        assertThrows(IllegalArgumentException.class, () -> {
            lab.getItem(items, 2);
        });
    }
}
