package com.vanderkast.leetcode.year2025.j2176;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class CountEqualAndDivisiblePairsInArrayTest {
    private final CountEqualAndDivisiblePairsInArray solution;

    protected CountEqualAndDivisiblePairsInArrayTest(CountEqualAndDivisiblePairsInArray solution) {
        this.solution = solution;
    }

    @Test
    void leetcode1() {
        var nums = new int[]{3, 1, 2, 2, 2, 1, 3};
        var k = 2;
        var expected = 4;

        var actual = solution.countPairs(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var nums = new int[]{1, 2, 3, 4};
        var k = 1;
        var expected = 0;

        var actual = solution.countPairs(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    void singleElement() {
        var nums = new int[]{9};
        var k = 9;
        var expected = 0;

        var actual = solution.countPairs(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    void permutations() {
        var nums = new int[]{10, 10, 10, 10};
        var k = 1;
        var expected = 6;

        var actual = solution.countPairs(nums, k);

        assertEquals(expected, actual);
    }
}
