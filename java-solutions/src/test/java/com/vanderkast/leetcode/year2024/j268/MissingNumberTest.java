package com.vanderkast.leetcode.year2024.j268;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class MissingNumberTest {
    private final MissingNumber solution;

    MissingNumberTest(MissingNumber solution) {
        this.solution = solution;
    }

    @Test
    void leetcodeExample1() {
        var nums = new int[]{3, 0, 1};
        var expected = 2;
        var actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums = new int[]{0, 1};
        var expected = 2;
        var actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        var expected = 8;
        var actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void oneElement_missing1() {
        var nums = new int[]{0};
        var expected = 1;
        var actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void oneElement_missing0() {
        var nums = new int[]{1};
        var expected = 0;
        var actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void missing0() {
        var nums = new int[]{1, 2, 3};
        var expected = 0;
        var actual = solution.missingNumber(nums);
        assertEquals(expected, actual);
    }
}
