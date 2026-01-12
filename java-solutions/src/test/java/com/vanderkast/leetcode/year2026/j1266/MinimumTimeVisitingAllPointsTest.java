package com.vanderkast.leetcode.year2026.j1266;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinimumTimeVisitingAllPointsTest {
    private final MinimumTimeVisitingAllPoints solution = new MinimumTimeVisitingAllPoints();

    @ParameterizedTest
    @MethodSource("testCases")
    void minTimeToVisitAllPoints(int[][] points, int expected) {
        var actual = solution.minTimeToVisitAllPoints(points);
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[][]{new int[]{0, 0}, new int[]{1, 0}}, 1),
                Arguments.of(new int[][]{new int[]{0, 0}, new int[]{0, 1}}, 1),
                Arguments.of(new int[][]{new int[]{0, 0}, new int[]{1, 1}}, 1),
                Arguments.of(new int[][]{new int[]{-1, -1}, new int[]{1, 1}}, 2),
                Arguments.of(new int[][]{new int[]{0, 0}, new int[]{-1, -1}}, 1),
                Arguments.of(new int[][]{new int[]{1, 1}, new int[]{3, 4}, new int[]{-1, 0}}, 7),
                Arguments.of(new int[][]{new int[]{3, 2}, new int[]{-2, 2}}, 5)
        );
    }
}