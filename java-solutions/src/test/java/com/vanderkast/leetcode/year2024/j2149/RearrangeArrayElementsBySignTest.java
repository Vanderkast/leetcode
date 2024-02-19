package com.vanderkast.leetcode.year2024.j2149;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class RearrangeArrayElementsBySignTest {
    private final RearrangeArrayElementsBySign solution = new RearrangeArrayElementsBySign();

    @Test
    void leetcodeExample1() {
        var nums = new int[]{3, 1, -2, -5, 2, -4};
        var expected = new int[]{3, -2, 1, -5, 2, -4};
        var actual = solution.rearrangeArray(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums = new int[]{-1, 1};
        var expected = new int[]{1, -1};
        var actual = solution.rearrangeArray(nums);
        assertArrayEquals(expected, actual);
    }
}
