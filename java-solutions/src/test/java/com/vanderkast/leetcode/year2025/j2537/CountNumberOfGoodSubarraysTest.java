package com.vanderkast.leetcode.year2025.j2537;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNumberOfGoodSubarraysTest {
    private final CountNumberOfGoodSubarrays solution = new CountNumberOfGoodSubarrays();

    @Test
    void leetcode1() {
        var nums = new int[]{1, 1, 1, 1, 1};
        var k = 10;
        var expected = 1;

        var actual = solution.countGood(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var nums = new int[]{3, 1, 4, 3, 2, 2, 4};
        var k = 2;
        var expected = 4;

        var actual = solution.countGood(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    void oneElement() {
        var nums = new int[]{1};
        var k = 1;
        var expected = 0;

        var actual = solution.countGood(nums, k);

        assertEquals(expected, actual);
    }
}
