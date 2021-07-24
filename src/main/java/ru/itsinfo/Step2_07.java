package ru.itsinfo;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Step2_07 {

    /**
     * Using closure write a lambda expression that calculates a*x^2 + b*x + c where a, b, c are context final variables.
     * Solution format. Submit your lambda expression in any valid format with ; on the end.
     *
     * Examples: (x, y) -> x + y; (x, y) -> { return x + y; }
     */
    public static Function<Integer , Double> closure01(final int a, final int b, final int c) {
        return x -> a * Math.pow(x,2) + b * x + c;
    }

    /**
     * Using closure write a lambda expression that adds prefix (before) and suffix (after) to its single string argument;
     * prefix and suffix are final variables and will be available in the context during testing.
     *
     * All whitespaces on the both ends of the argument must be removed. Do not trim prefix, suffix and the result string.
     *
     * Solution format. Submit your lambda expression in any valid format with ; on the end.
     */
    public static UnaryOperator<String> closure02(final String prefix, final String suffix) {
        return s -> prefix.concat(s.trim()).concat(suffix);
    }
}
