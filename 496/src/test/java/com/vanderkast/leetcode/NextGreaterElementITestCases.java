package com.vanderkast.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public abstract class NextGreaterElementITestCases {
    protected abstract NextGreaterElementI getSolution();

    @Test
    void leetcode1() {
        // given
        var nums1 = new int[]{4, 1, 2};
        var nums2 = new int[]{1, 3, 4, 2};

        // when
        var actual = getSolution().nextGreaterElement(nums1, nums2);

        // then
        assertArrayEquals(new int[]{-1, 3, -1}, actual);
    }

    @Test
    void leetcode2() {
        // given
        var nums1 = new int[]{2, 4};
        var nums2 = new int[]{1, 2, 3, 4};

        // when
        var actual = getSolution().nextGreaterElement(nums1, nums2);

        // then
        assertArrayEquals(new int[]{3, -1}, actual);
    }
}
