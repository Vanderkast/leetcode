package com.vanderkast.leetcode.j746;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinCostClimbingStairsTest {
    private final MinCostClimbingStairs solution = new MinCostClimbingStairs();

    @Test
    void leetcode1() {
        var cost = new int[]{10, 15, 20};
        var expected = 15;
        int actual = solution.minCostClimbingStairs(cost);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        var expected = 6;
        int actual = solution.minCostClimbingStairs(cost);
        assertEquals(expected, actual);
    }

    @Test
    void twoStairs_First() {
        var cost = new int[]{1, 2};
        var expected = cost[0];
        int actual = solution.minCostClimbingStairs(cost);
        assertEquals(expected, actual);
    }

    @Test
    void twoStairs_Second() {
        var cost = new int[]{2, 1};
        var expected = cost[1];
        int actual = solution.minCostClimbingStairs(cost);
        assertEquals(expected, actual);
    }
}
