package ru.itsinfo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Step2_04_Test {

    @Test
    void upperWords() {
        assertEquals("THELAMBDAHASTOOMANYSTRINGARGUMENTS", Step2_04.upperWords().apply("The", "lambda", "has", "too", "many", "string", "arguments"));
    }
}