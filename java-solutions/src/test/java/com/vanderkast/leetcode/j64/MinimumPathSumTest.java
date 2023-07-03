package com.vanderkast.leetcode.j64;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {
    private final MinimumPathSum solution = new MinimumPathSum();

    @Test
    void leetcode1() {
        var grid = new int[][] {
                new int[]{1, 3, 1},
                new int[]{1, 5, 1},
                new int[]{4, 2, 1},
        };
        var expected = 7;
        var actual = solution.minPathSum(grid);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var grid = new int[][] {
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
        };
        var expected = 12;
        var actual = solution.minPathSum(grid);
        assertEquals(expected, actual);
    }
}
