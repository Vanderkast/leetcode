package com.vanderkast.leetcode.year2024.j3005;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountElementsWithMaximumFrequencyTest {
    private final CountElementsWithMaximumFrequency solution = new CountElementsWithMaximumFrequency();

    @Test
    void leetcodeExample1() {
        var nums = new int[]{1, 2, 2, 3, 1, 4};
        var expected = 4;
        var actual = solution.maxFrequencyElements(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums = new int[]{1, 2, 3, 4, 5};
        var expected = 5;
        var actual = solution.maxFrequencyElements(nums);
        assertEquals(expected, actual);
    }

    @Test
    void singleElement() {
        var nums = new int[]{1};
        var expected = 1;
        var actual = solution.maxFrequencyElements(nums);
        assertEquals(expected, actual);
    }

    @Test
    void oneNumber() {
        var nums = new int[]{1, 1, 1};
        var expected = 3;
        var actual = solution.maxFrequencyElements(nums);
        assertEquals(expected, actual);
    }
}
