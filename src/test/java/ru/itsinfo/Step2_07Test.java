package ru.itsinfo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Step2_07Test {

    @Test
    void closure01() {
        assertEquals(11.0, Step2_07.closure01(1, 2, 3).apply(2));
        assertEquals(3180.0, Step2_07.closure01(7, 4, 9).apply(21));
    }

    @Test
    void closure02() {
        assertEquals("prefixstringsuffix", Step2_07.closure02("prefix", "suffix").apply("  string"));
        assertEquals("prefix string  suffix", Step2_07.closure02("prefix ", "  suffix").apply("  string "));
    }
}