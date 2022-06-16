package com.vanderkast.leetcode.j70;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    private final ClimbingStairs solution = new ClimbingStairs();

    @Test
    void leetcode1() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    void leetcode2() {
        assertEquals(3, solution.climbStairs(3));
    }
}
