package com.vanderkast.leetcode.year2023.j1913;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductDifferenceBetweenTwoPairsTest {
    private final MaximumProductDifferenceBetweenTwoPairs solution = new MaximumProductDifferenceBetweenTwoPairs();

    @Test
    void leetcodeExamople1() {
        var given = new int[]{5, 6, 2, 7, 4};
        var expected = 34;
        var actual = solution.maxProductDifference(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExamople2() {
        var given = new int[]{4, 2, 5, 9, 7, 4, 8};
        var expected = 64;
        var actual = solution.maxProductDifference(given);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var given = new int[]{1, 1, 1, 1};
        var expected = 0;
        var actual = solution.maxProductDifference(given);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var given = new int[]{2, 1, 1, 1};
        var expected = 1;
        var actual = solution.maxProductDifference(given);
        assertEquals(expected, actual);
    }
}
