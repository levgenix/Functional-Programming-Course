package ru.itsinfo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Step2_06Test {

    @Nested
    class DistinctStrings {

        @Test
        @DisplayName("java scala java clojure clojure")
        void gettingDistinctStrings_01() {
            List<String> list = Step2_06.gettingDistinctStrings().apply(Arrays.asList("java scala java clojure clojure".split(" ")));
            assertEquals(3,list.size());
            assertTrue(list.contains("clojure"));
            assertTrue(list.contains("java"));
            assertTrue(list.contains("scala"));
        }

        @Test
        @DisplayName("the three the three the three an an a")
        void gettingDistinctStrings_02() {
            List<String> list = Step2_06.gettingDistinctStrings().apply(Arrays.asList("the three the three the three an an a".split(" ")));
            assertEquals(4,list.size());
            assertTrue(list.contains("a"));
            assertTrue(list.contains("an"));
            assertTrue(list.contains("the"));
            assertTrue(list.contains("three"));
        }
    }
}