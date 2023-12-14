package com.vanderkast.leetcode.year2023.j2482;

import org.junit.jupiter.api.Test;

import static com.vanderkast.leetcode.tools.Matrix.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferenceBetweenOnesAndZerosInRowAndColumnTest {
    private final DifferenceBetweenOnesAndZerosInRowAndColumn
            solution = new DifferenceBetweenOnesAndZerosInRowAndColumn();

    @Test
    void leetcodeExample1() {
        var given = matrix(
                row(0, 1, 1),
                row(1, 0, 1),
                row(0, 0, 1)
        );
        var expected = matrix(
                row(0, 0, 4),
                row(0, 0, 4),
                row(-2, -2, 2)
        );
        var actual = solution.onesMinusZeros(given);
        assertMatrixEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var given = matrix(
                row(1, 1, 1),
                row(1, 1, 1)
        );
        var expected = matrix(
                row(5, 5, 5),
                row(5, 5, 5)
        );
        var actual = solution.onesMinusZeros(given);
        assertMatrixEquals(expected, actual);
    }

    @Test
    void oneOne() {
        var given = matrix(row(1));
        var expected = matrix(row(2));
        var actual = solution.onesMinusZeros(given);
        assertMatrixEquals(expected, actual);
    }

    @Test
    void oneZero() {
        var given = matrix(row(0));
        var expected = matrix(row(-2));
        var actual = solution.onesMinusZeros(given);
        assertMatrixEquals(expected, actual);
    }
}
