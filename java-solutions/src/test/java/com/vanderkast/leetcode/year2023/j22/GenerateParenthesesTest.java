package com.vanderkast.leetcode.year2023.j22;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateParenthesesTest {
    private final GenerateParentheses solution = new GenerateParentheses();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int pairs, List<String> expected) {
        var actual = solution.generateParenthesis(pairs);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.arguments(1, List.of("()")),
                Arguments.arguments(2, List.of("(())", "()()")),
                Arguments.arguments(3, List.of("((()))", "(()())", "(())()", "()(())", "()()()"))
        );
    }
}
