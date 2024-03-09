package com.vanderkast.leetcode.year2024.j2540;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCommonValueTest {
    private final MinimumCommonValue solution = new MinimumCommonValue();

    @Test
    void leetcodeExample1() {
        var nums1 = new int[]{1, 2, 3};
        var nums2 = new int[]{2, 4};
        var expected = 2;
        var actual = solution.getCommon(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums1 = new int[]{1, 2, 3, 6};
        var nums2 = new int[]{2, 3, 4, 5};
        var expected = 2;
        var actual = solution.getCommon(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    void noCommon() {
        var nums1 = new int[]{1, 3, 5};
        var nums2 = new int[]{2, 4, 6};
        var expected = -1;
        var actual = solution.getCommon(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    void oneElementLeft() {
        var nums1 = new int[]{7};
        var nums2 = new int[]{2, 4, 6, 7};
        var expected = 7;
        var actual = solution.getCommon(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    void oneElementRight() {
        var nums1 = new int[]{1, 3, 5, 6};
        var nums2 = new int[]{6};
        var expected = 6;
        var actual = solution.getCommon(nums1, nums2);
        assertEquals(expected, actual);
    }
}
