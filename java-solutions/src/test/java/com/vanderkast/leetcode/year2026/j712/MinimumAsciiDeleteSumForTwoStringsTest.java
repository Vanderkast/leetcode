package com.vanderkast.leetcode.year2026.j712;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAsciiDeleteSumForTwoStringsTest {
    private final MinimumAsciiDeleteSumForTwoStrings solution = new MinimumAsciiDeleteSumForTwoStrings();

    @ParameterizedTest
    @MethodSource("testCases")
    void minimumDeleteSum(String s1, String s2, int expected) {
        var actual = solution.minimumDeleteSum(s1, s2);
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("sea", "eat", 231),
                Arguments.of("delete", "leet", 403),
                Arguments.of("same", "same", 0),
                Arguments.of("ab", "cd", (int) 'a' + 'b' + 'c' + 'd')
        );
    }
}
