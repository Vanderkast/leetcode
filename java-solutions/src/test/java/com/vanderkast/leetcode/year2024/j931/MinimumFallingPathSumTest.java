package com.vanderkast.leetcode.year2024.j931;

import org.junit.jupiter.api.Test;

import static com.vanderkast.leetcode.tools.Matrix.matrix;
import static org.junit.jupiter.api.Assertions.*;

class MinimumFallingPathSumTest {
    private final MinimumFallingPathSum solution = new MinimumFallingPathSum();

    @Test
    void leertcodeExample1() {
        var matrix = matrix("[[2,1,3],[6,5,4],[7,8,9]]");
        var expected = 13;
        var actual = solution.minFallingPathSum(matrix);
        assertEquals(expected, actual);
    }

    @Test
    void leertcodeExample2() {
        var matrix = matrix("[[-19,57],[-40,-5]]");
        var expected = -59;
        var actual = solution.minFallingPathSum(matrix);
        assertEquals(expected, actual);
    }

    @Test
    void singleElement() {
        var matrix = matrix("[[100]]");
        var expected = 100;
        var actual = solution.minFallingPathSum(matrix);
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
