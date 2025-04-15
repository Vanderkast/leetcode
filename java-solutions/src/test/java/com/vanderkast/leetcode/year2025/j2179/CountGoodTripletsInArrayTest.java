package com.vanderkast.leetcode.year2025.j2179;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountGoodTripletsInArrayTest {
    private final CountGoodTripletsInArray solution = new CountGoodTripletsInArray();

    @Test
    void leetcode1() {
        var nums1 = new int[]{2, 0, 1, 3};
        var nums2 = new int[]{0, 1, 2, 3};
        var expected = 1;

        var actual = solution.goodTriplets(nums1, nums2);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var nums1 = new int[]{4, 0, 1, 3, 2};
        var nums2 = new int[]{4, 1, 0, 2, 3};
        var expected = 4;

        var actual = solution.goodTriplets(nums1, nums2);

        assertEquals(expected, actual);
    }

    @Test
    void noGoodTriplets() {
        var nums1 = new int[]{0, 1, 2};
        var nums2 = new int[]{2, 1, 0};
        var expected = 0;

        var actual = solution.goodTriplets(nums1, nums2);

        assertEquals(expected, actual);
    }
}
