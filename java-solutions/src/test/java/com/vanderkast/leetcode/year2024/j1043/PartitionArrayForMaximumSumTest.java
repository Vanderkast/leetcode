package com.vanderkast.leetcode.year2024.j1043;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionArrayForMaximumSumTest {
    private final PartitionArrayForMaximumSum solution = new PartitionArrayForMaximumSum();

    @Test
    void leetcodeExample1() {
        var arr = new int[]{1, 15, 7, 9, 2, 5, 10};
        var k = 3;
        var expected = 84;
        var actual = solution.maxSumAfterPartitioning(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var arr = new int[]{1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3};
        var k = 4;
        var expected = 83;
        var actual = solution.maxSumAfterPartitioning(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var arr = new int[]{1};
        var k = 1;
        var expected = 1;
        var actual = solution.maxSumAfterPartitioning(arr, k);
        assertEquals(expected, actual);
    }
}
