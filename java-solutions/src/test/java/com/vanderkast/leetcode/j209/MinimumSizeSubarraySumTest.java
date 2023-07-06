package com.vanderkast.leetcode.j209;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSizeSubarraySumTest {
    private final MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

    @Test
    void leetcode1() {
        var nums = new int[]{2, 3, 1, 2, 4, 3};
        var target = 7;
        var expected = 2;
        var actual = solution.minSubArrayLen(target, nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var nums = new int[]{1, 4, 4};
        var target = 4;
        var expected = 1;
        var actual = solution.minSubArrayLen(target, nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode3() {
        var nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        var target = 11;
        var expected = 0;
        var actual = solution.minSubArrayLen(target, nums);
        assertEquals(expected, actual);
    }
}
