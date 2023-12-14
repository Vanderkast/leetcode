package com.vanderkast.leetcode.year2023.j136;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {
    private final SingleNumber solution = new SingleNumber();

    @Test
    void leetcodeExample1() {
        var nums = new int[]{2, 2, 1};
        var expected = 1;
        var actual = solution.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums = new int[]{4,1,2,1,2};
        var expected = 4;
        var actual = solution.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var nums = new int[]{1};
        var expected = 1;
        var actual = solution.singleNumber(nums);
        assertEquals(expected, actual);
    }
}
