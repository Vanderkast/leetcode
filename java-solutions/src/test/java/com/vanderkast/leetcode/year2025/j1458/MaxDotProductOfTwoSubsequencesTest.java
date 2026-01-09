package com.vanderkast.leetcode.year2025.j1458;

import com.vanderkast.leetcode.year2026.j1458.MaxDotProductOfTwoSubsequences;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxDotProductOfTwoSubsequencesTest {
    private final MaxDotProductOfTwoSubsequences solution = new MaxDotProductOfTwoSubsequences();

    @ParameterizedTest
    @MethodSource("testCases")
    void maxDotProductOfTwoSubsequences(int[] a, int[] b, int expected) {
        var actual = solution.maxDotProduct(a, b);
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, -2, 5}, new int[]{3, 0, -6}, 18),
                Arguments.of(new int[]{3, -2}, new int[]{2, -6, 7}, 21),
                Arguments.of(new int[]{-1, -1}, new int[]{1, 1}, -1),
                Arguments.of(new int[]{-100}, new int[]{100}, -10000),
                Arguments.of(new int[]{-2}, new int[]{-3}, 6)
        );
    }
}
