package com.vanderkast.leetcode.year2023.j1582;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.vanderkast.leetcode.tools.Matrix.row;
import static com.vanderkast.leetcode.tools.Matrix.matrix;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SpecialPositionsInBinaryMatrixTest {
    private final SpecialPositionsInBinaryMatrix solution = new SpecialPositionsInBinaryMatrix();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int[][] matrix, int expected) {
        var actual = solution.numSpecial(matrix);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
//                Arguments.arguments(
//                        matrix(
//                                line(1)
//                        ),
//                        1
//                ),
//                Arguments.arguments(
//                        matrix(
//                                line(1, 0, 0),
//                                line(0, 0, 1),
//                                line(1, 0, 0)
//                        ),
//                        1
//                ),
//                Arguments.arguments(
//                        matrix(
//                                line(1, 1, 1),
//                                line(1, 1, 1)
//                        ),
//                        0
//                ),
//                Arguments.arguments(
//                        matrix(
//                                line(1, 0, 0),
//                                line(0, 1, 0),
//                                line(0, 0, 1)
//                        ),
//                        3
//                ),
//                Arguments.arguments(
//                        matrix(
//                                line(0, 0, 0, 1),
//                                line(1, 0, 0, 0),
//                                line(0, 1, 1, 0),
//                                line(0, 0, 0, 0)
//                        ),
//                        2
//                ),
//                Arguments.arguments(
//                        matrix(
//                                line(0, 0, 0, 0, 0),
//                                line(1, 0, 0, 0, 0),
//                                line(0, 1, 0, 0, 0),
//                                line(0, 0, 1, 0, 0),
//                                line(0, 0, 0, 1, 1)
//                        ),
//                        3
//                ),
//                Arguments.arguments(
//                        matrix(
//                                line(0, 0),
//                                line(1, 1)
//                        ),
//                        0
//                ),
                Arguments.arguments(
                        matrix(
                                row(0, 0, 1, 0),
                                row(0, 0, 0, 0),
                                row(0, 0, 0, 0),
                                row(0, 1, 0, 0)
                        ),
                        2
                )
        );
    }
}
