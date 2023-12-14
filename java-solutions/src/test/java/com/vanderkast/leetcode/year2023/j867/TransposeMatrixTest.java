package com.vanderkast.leetcode.year2023.j867;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.vanderkast.leetcode.tools.Matrix.row;
import static com.vanderkast.leetcode.tools.Matrix.matrix;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TransposeMatrixTest {
    private final TransposeMatrix solution = new TransposeMatrix();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int[][] matrix, int[][] expected) {
        var actual = solution.transpose(matrix);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].length, actual[i].length);
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.arguments(
                        matrix(row(1)),
                        matrix(row(1))),
                Arguments.arguments(
                        matrix(
                                row(1, 2, 3),
                                row(4, 5, 6),
                                row(7, 8, 9)
                        ),
                        matrix(
                                row(1, 4, 7),
                                row(2, 5, 8),
                                row(3, 6, 9)
                        )),

                Arguments.arguments(
                        matrix(
                                row(1, 2, 3),
                                row(4, 5, 6)
                        ),
                        matrix(
                                row(1, 4),
                                row(2, 5),
                                row(3, 6)
                        ))
        );
    }
}
