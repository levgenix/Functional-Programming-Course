package ru.itsinfo;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step2_06 {

    /**
     * Write a lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating).
     * The order of elements in the result list may be any (elements will be sorted by the testing system).
     *
     * If the input list doesn't contain any strings then the result list should be empty.
     *
     * Hints: it is possible to use sets, maps, lists and so on for helping.
     *
     * Solution format. Submit your lambda expression in any valid format with ; on the end.
     *
     * Examples: x -> x; (x) -> { return x; };
     *
     * Sample Input 1: java scala java clojure clojure
     * Sample Output 1: clojure java scala
     *
     * Sample Input 2: the three the three the three an an a
     * Sample Output 2: a an the three
     */
    public static UnaryOperator<List<String>> gettingDistinctStrings() {
        return list -> new ArrayList<String>(new HashSet<String>(list));
    }
}
