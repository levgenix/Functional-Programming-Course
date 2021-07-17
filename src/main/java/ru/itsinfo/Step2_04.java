package ru.itsinfo;

import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step2_04 {

    /**
     * Write a lambda expression that accepts seven (!) string arguments and returns a string in upper case concatenated
     * from all of them (in the order of arguments).
     *
     * Note. The correct solution may not work in your local environment because you don't have suitable
     * functional interface. The testing system has the interface and can test your solution.
     *
     * Solution format. Submit your lambda expression with seven arguments in any valid format with ; on the end.
     *
     * Examples (only with two args): (x, y)  -> x + y; (x, y) -> { return x + y; };
     *
     * Sample Input: The lambda has too many string arguments.
     * Sample Output: THELAMBDAHASTOOMANYSTRINGARGUMENTS.
     * @return
     */
    public static SevenWordsFunction<String> upperWords() {
        return (s0, s1, s2, s3, s4, s5, s6) -> Stream.of(s0, s1, s2, s3, s4, s5, s6)
                .map(String::toUpperCase)
                .reduce("", String::concat);
    }

    @FunctionalInterface
    public interface SevenWordsFunction<String> {
        String apply(String s1, String s2, String s3, String s4, String s5, String s6, String s7);
    }
}
