package ru.itsinfo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Module 2")
class Step2_04Test {

    @Test
    @DisplayName("Task 3.1: maxFunction")
    void maxFunction() {
        assertEquals(30, Step2_04.maxFunction().apply(2, 30));
        assertEquals(5, Step2_04.maxFunction().apply(5, 1));
        assertEquals(2, Step2_04.maxFunction().apply(2, 2));
    }

    @Test
    @DisplayName("Task 3.2: evenNumberFunction")
    void evenNumberFunction() {
        assertEquals(4L, Step2_04.evenNumberFunction().apply(2L));
        assertEquals(318L, Step2_04.evenNumberFunction().apply(317L));
    }
}