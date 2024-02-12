package com.vanderkast.leetcode.year2024.j169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {
    private final MajorityElement solution = new MajorityElement();

    @Test
    void leetcodeExample1() {
        var nums = new int[]{3, 2, 3};
        var expected = 3;
        var actual = solution.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        var expected = 2;
        var actual = solution.majorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    void oneElement() {
        var nums = new int[]{5};
        var expected = 5;
        var actual = solution.majorityElement(nums);
        assertEquals(expected, actual);
    }
}
