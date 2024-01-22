package com.vanderkast.leetcode.year2024.j287;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateNumberTest {
    private final FindDuplicateNumber solution = new FindDuplicateNumber();

    @Test
    void leetcodeExample1() {
        var nums = new int[]{1, 3, 4, 2,2};
        var expected = 2;
        var actual = solution.findDuplicate(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums = new int[]{3, 1, 3, 4, 2};
        var expected = 3;
        var actual = solution.findDuplicate(nums);
        assertEquals(expected, actual);
    }
}
