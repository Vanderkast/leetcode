package com.vanderkast.leetcode.year2024.j349;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {
    private final IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();

    @Test
    void leetcodeExample1() {
        var nums1 = new int[]{1, 2, 2, 1};
        var nums2 = new int[]{2, 2};
        var expected = new int[]{2};
        var actual = solution.intersection(nums1, nums2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums1 = new int[]{4, 9, 5};
        var nums2 = new int[]{9, 4, 9, 8, 4};
        var expected = new int[]{9, 4};
        var actual = solution.intersection(nums1, nums2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void cornerCase() {
        var nums1 = new int[]{0, 1000};
        var nums2 = new int[]{0, 100, 500, 900, 1000};
        var expected = new int[]{0, 1000};
        var actual = solution.intersection(nums1, nums2);
        assertArrayEquals(expected, actual);
    }
}
