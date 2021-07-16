package ru.itsinfo;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Step2 {

    /**
     * Write a lambda expression that accepts two integers arguments and returns max of them.
     * Try not to use the Math library.
     * Solution format. Submit your lambda expression in any valid format with ; on the end.
     *
     * Examples: (x, y) -> x + y; (x) -> { return x; };
     *
     * Sample Input: 1 4
     * Sample Output: 4
     */
    public static BinaryOperator<Integer> maxFunction() {
        //BinaryOperator<Integer> maxFunc = (x, y) -> x > y ? x : y;
        // or..
        //BinaryOperator<Integer> maxFunction = Integer::max;
        return Integer::max;
    }

    /**
     * Write a lambda expression that accepts a long value and returns the next even number.
     * It is guaranteed an input number is non-negative.
     *
     * Solution format. Submit your lambda expression in any valid format with ; on the end.
     * Examples: x -> x; (x) -> x; (x) -> { return x; };
     *
     * Sample Input 1: 2
     * Sample Output 1: 4
     *
     * Sample Input 2: 317
     * Sample Output 2: 318
     */
    public static UnaryOperator<Long> evenNumberFunction() {
        return x -> x + (2 - x % 2);
    }
}
