package com.vanderkast.leetcode.year2024.j496;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementITest {
    private final NextGreaterElementI solution = new NextGreaterElementI();

    @Test
    void leetcodeExample1() {
        var nums1 = new int[]{4, 1, 2};
        var nums2 = new int[]{1, 3, 4, 2};
        var expected = new int[]{-1, 3, -1};
        var actual = solution.nextGreaterElement(nums1, nums2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums1 = new int[]{2, 4};
        var nums2 = new int[]{1, 2, 3, 4};
        var expected = new int[]{3, -1};
        var actual = solution.nextGreaterElement(nums1, nums2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void oneElement() {
        var nums1 = new int[]{1};
        var nums2 = new int[]{1};
        var expected = new int[]{-1};
        var actual = solution.nextGreaterElement(nums1, nums2);
        assertArrayEquals(expected, actual);
    }
}
