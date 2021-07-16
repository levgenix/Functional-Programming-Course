package ru.itsinfo.module02;

import java.util.function.BinaryOperator;

public class Ex03 {
    public static void main(String[] args) {
        BinaryOperator<Integer> maxFunc = (x, y) -> x > y ? x : y;
        // or..
        BinaryOperator<Integer> maxFunction = Integer::max;

        System.out.println(maxFunction.apply(2, 30));
        System.out.println(maxFunction.apply(5, 1));
    }
}
