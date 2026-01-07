package com.vanderkast.leetcode.year2026.j1975;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.vanderkast.leetcode.tools.Matrix.matrix;
import static com.vanderkast.leetcode.tools.Matrix.row;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumMatrixSumTest {
    private final MaximumMatrixSum solution = new MaximumMatrixSum();

    @ParameterizedTest
    @MethodSource("testCases")
    void maxMatrixSum(int[][] matrix, int expected) {
        var actual = solution.maxMatrixSum(matrix);
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        matrix(
                                row(-1, 1),
                                row(1, -1)
                        ),
                        4),
                Arguments.of(
                        matrix(
                                row(1, 2, 3),
                                row(-1, -2, -3),
                                row(1, 2, 3)
                        ),
                        16),
                Arguments.of(
                        matrix(
                                row(2, 9, 3),
                                row(5, 4, -4),
                                row(1, 7, 1)
                        ),
                        34)
        );
    }
}