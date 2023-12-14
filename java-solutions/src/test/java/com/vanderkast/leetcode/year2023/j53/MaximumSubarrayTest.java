package com.vanderkast.leetcode.year2023.j53;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class MaximumSubarrayTest {
    private final MaximumSubarray solution;

    MaximumSubarrayTest(MaximumSubarray solution) {
        this.solution = solution;
    }

    @Test
    void leetcodeExample1() {
        var expected = 6;
        var actual = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
            var expected = 1;
            var actual = solution.maxSubArray(new int[]{1});
            assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var expected = 23;
        var actual = solution.maxSubArray(new int[]{5, 4, -1, 7, 8});
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var expected = -1;
        var actual = solution.maxSubArray(new int[]{-1});
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var expected = -1;
        var actual = solution.maxSubArray(new int[]{-3, -1});
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        var expected = 0;
        var actual = solution.maxSubArray(new int[]{-3, 0, -1});
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        var expected = -1;
        var actual = solution.maxSubArray(new int[]{-1, -3});
        assertEquals(expected, actual);
    }
}

