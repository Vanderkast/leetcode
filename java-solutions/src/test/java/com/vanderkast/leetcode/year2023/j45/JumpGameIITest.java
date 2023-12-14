package com.vanderkast.leetcode.year2023.j45;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {
    private final JumpGameII solution = new JumpGameII();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int[] nums, int expected) {
        var actual = solution.jump(nums);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.arguments(new int[]{1}, 0),
                Arguments.arguments(new int[]{1, 1}, 1),
                Arguments.arguments(new int[]{1, 1, 1}, 2),
                Arguments.arguments(new int[]{2, 1, 1}, 1),
                Arguments.arguments(new int[]{2, 3, 1, 1, 4}, 2),
                Arguments.arguments(new int[]{2, 3, 0, 1, 4}, 2),
                Arguments.arguments(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0}, 3)
        );
    }
}
