package ru.itsinfo.module02;

import java.util.function.BinaryOperator;

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
public class Ex_03_01 {
    public static void main(String[] args) {
        BinaryOperator<Integer> maxFunc = (x, y) -> x > y ? x : y;
        // or..
        BinaryOperator<Integer> maxFunction = Integer::max;

        System.out.println(maxFunction.apply(2, 30));
        System.out.println(maxFunction.apply(5, 1));
    }
}
