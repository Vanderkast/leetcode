package com.vanderkast.leetcode.year2024.j1289;

import org.junit.jupiter.api.Test;

import static com.vanderkast.leetcode.tools.Matrix.matrix;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumFallingPathSumIITest {
    private final MinimumFallingPathSumII solution = new MinimumFallingPathSumII();

    @Test
    void leetcodeExample1() {
        var grid = matrix("[[1,2,3],[4,5,6],[7,8,9]]");
        var expected = 13;
        var actual = solution.minFallingPathSum(grid);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var grid = matrix("[[7]]");
        var expected = 7;
        var actual = solution.minFallingPathSum(grid);
        assertEquals(expected, actual);
    }

    @Test
    void diagonal() {
        var matrix = matrix("[[-1, 0, 0], [0, -1, 0], [0, 0, -1]]");
        var expected = -3;
        var actual = solution.minFallingPathSum(matrix);
        assertEquals(expected, actual);
    }

    @Test
    void alterDiagonal() {
        var matrix = matrix("[[0, 0, -1], [0, -1, 0], [-1, 0, 0]]");
        var expected = -3;
        var actual = solution.minFallingPathSum(matrix);
        assertEquals(expected, actual);
    }
}
