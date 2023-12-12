package com.vanderkast.leetcode.j1464;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductOfTwoElementsInArrayTest {
    private final MaximumProductOfTwoElementsInArray solution = new MaximumProductOfTwoElementsInArray();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int[] nums, int expected) {
        var actual = solution.maxProduct(nums);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.arguments(new int[]{3, 4, 5, 2}, 12),
                Arguments.arguments(new int[]{1, 5, 4, 5}, 16),
                Arguments.arguments(new int[]{3, 7}, 12),
                Arguments.arguments(new int[]{1, 1, 1, 2}, 0)
        );
    }
}
