package com.vanderkast.leetcode.year2024.j645;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SetMismatchTest {
    private final SetMismatch solution = new SetMismatch();

    @Test
    void leetcodeExample1() {
        var nums = new int[]{1, 2, 2, 4};
        var expected = new int[]{2, 3};
        var actual = solution.findErrorNums(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums = new int[]{1, 1};
        var expected = new int[]{1, 2};
        var actual = solution.findErrorNums(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    void antiLeetcodeExample2() {
        var nums = new int[]{2, 2};
        var expected = new int[]{2, 1};
        var actual = solution.findErrorNums(nums);
        assertArrayEquals(expected, actual);
    }
}
