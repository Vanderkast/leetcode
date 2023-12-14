package com.vanderkast.leetcode.year2023.j1493;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubarrayOf1sAfterDeletingOneElementTest {
    private final LongestSubarrayOf1sAfterDeletingOneElement solution
            = new LongestSubarrayOf1sAfterDeletingOneElement();

    @Test
    void leetcode1() {
        var nums = new int[]{1, 1, 0, 1};
        var expected = 3;
        var actual = solution.longestSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var nums = new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1};
        var expected = 5;
        var actual = solution.longestSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode3() {
        var nums = new int[]{1, 1, 1};
        var expected = 2;
        var actual = solution.longestSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    void zeros() {
        var nums = new int[]{0, 0, 0, 0};
        var expected = 0;
        var actual = solution.longestSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode36() {
        var nums = new int[]{0, 0, 1, 1};
        var expected = 2;
        var actual = solution.longestSubarray(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode38() {
        var nums = new int[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        var expected = 18;
        var actual = solution.longestSubarray(nums);
        assertEquals(expected, actual);
    }
}
