package com.vanderkast.leetcode.year2025.j3375;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumOperationsToMakeArrayValuesEqualToKTest {
    private final MinimumOperationsToMakeArrayValuesEqualToK solution
            = new MinimumOperationsToMakeArrayValuesEqualToK();

    @Test
    void leetcode1() {
        var nums = new int[]{5, 2, 5, 4, 5};
        var k = 2;
        var expected = 2;

        var actual = solution.minOperations(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var nums = new int[]{2, 1, 2};
        var k = 2;
        var expected = -1;

        var actual = solution.minOperations(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode3() {
        var nums = new int[]{9, 7, 5, 3};
        var k = 1;
        var expected = 4;

        var actual = solution.minOperations(nums, k);

        assertEquals(expected, actual);
    }
}
