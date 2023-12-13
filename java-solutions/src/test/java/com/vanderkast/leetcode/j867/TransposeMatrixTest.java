package com.vanderkast.leetcode.j867;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.vanderkast.leetcode.tools.Matrix.line;
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
                        matrix(line(1)),
                        matrix(line(1))),
                Arguments.arguments(
                        matrix(
                                line(1, 2, 3),
                                line(4, 5, 6),
                                line(7, 8, 9)
                        ),
                        matrix(
                                line(1, 4, 7),
                                line(2, 5, 8),
                                line(3, 6, 9)
                        )),

                Arguments.arguments(
                        matrix(
                                line(1, 2, 3),
                                line(4, 5, 6)
                        ),
                        matrix(
                                line(1, 4),
                                line(2, 5),
                                line(3, 6)
                        ))
        );
    }
}
