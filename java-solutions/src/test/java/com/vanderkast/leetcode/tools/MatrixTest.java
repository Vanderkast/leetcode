package com.vanderkast.leetcode.tools;

import org.junit.jupiter.api.Test;

import static com.vanderkast.leetcode.tools.Matrix.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixTest {

    @Test
    void matrixPositive() {
        var view = "[[1, 2, 3], [4, 5, 6], [7, 8, 9]]";
        var expected = matrix(row(1, 2, 3), row(4, 5, 6), row(7, 8, 9));
        var actual = matrix(view);
        assertMatrixEquals(expected, actual);
    }

    @Test
    void rowPositive() {
        var view = "[1, 2, 3]";
        var expected = row(1, 2, 3);
        var actual = row(view);
        assertArrayEquals(expected, actual);
    }

    @Test
    void rowNoElements() {
        var view = "[]";
        var expected = row();
        var actual = row(view);
        assertArrayEquals(expected, actual);
    }
}
