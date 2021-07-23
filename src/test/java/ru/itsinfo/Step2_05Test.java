package ru.itsinfo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Step2_05Test {

    @Test
    void CalculatingProductionOfAllNumbersInTheRange() {
        assertEquals(0L, Step2_05.calculatingProductionOfAllNumbersInTheRangeFunction().apply(0L, 1L));
        assertEquals(2L, Step2_05.calculatingProductionOfAllNumbersInTheRangeFunction().apply(2L, 2L));
        assertEquals(24L, Step2_05.calculatingProductionOfAllNumbersInTheRangeFunction().apply(1L, 4L));
        assertEquals(54486432000L, Step2_05.calculatingProductionOfAllNumbersInTheRangeFunction().apply(5L, 15L));
    }
}