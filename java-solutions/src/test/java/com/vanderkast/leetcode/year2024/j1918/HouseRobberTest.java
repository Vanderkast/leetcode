package com.vanderkast.leetcode.year2024.j1918;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {
    private final HouseRobber solution = new HouseRobber();

    @Test
    void leetcodeExample1() {
        var nums = new int[]{1, 2, 3, 1};
        var expected = 4;
        var actual = solution.rob(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums = new int[]{2, 7, 9, 3, 1};
        var expected = 12;
        var actual = solution.rob(nums);
        assertEquals(expected, actual);
    }

    @Test
    void skip2() {
        var nums = new int[]{5, 0, 0, 5};
        var expected = 10;
        var actual = solution.rob(nums);
        assertEquals(expected, actual);
    }

    @Test
    void oneGo() {
        var nums = new int[]{0, 5, 5};
        var expected = 5;
        var actual = solution.rob(nums);
        assertEquals(expected, actual);
    }
}
