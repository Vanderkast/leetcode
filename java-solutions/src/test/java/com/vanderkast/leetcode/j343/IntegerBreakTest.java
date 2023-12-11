package com.vanderkast.leetcode.j343;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IntegerBreakTest {
    private final IntegerBreak solution = new IntegerBreak();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int n, int expected) {
        var actual = solution.integerBreak(n);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.arguments(2, 1),
                Arguments.arguments(3, 2),
                Arguments.arguments(4, 4),
                Arguments.arguments(9, 27),
                Arguments.arguments(10, 36)
        );
    }
}
