package ru.itsinfo.module02;

import java.util.function.UnaryOperator;

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
public class Ex_03_02 {
    public static void main(String[] args) {
        UnaryOperator<Long> evenNumberFunction = x -> x % 2 == 0 ? x + 2 : ++x;

        System.out.println(evenNumberFunction.apply(2L));
        System.out.println(evenNumberFunction.apply(317L));
    }
}
