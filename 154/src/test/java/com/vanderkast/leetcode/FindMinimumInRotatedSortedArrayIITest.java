package com.vanderkast.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayIITest {
    private final FindMinimumInRotatedSortedArrayII solution = new FindMinimumInRotatedSortedArrayII();

    @Test
    void leetcode1() {
        assertEquals(1, solution.findMin(new int[]{1, 3, 5}));
    }

    @Test
    void leetcode2() {
        assertEquals(0, solution.findMin(new int[]{2, 2, 2, 0, 1}));
    }

    @Test
    void leetcode146() {
        assertEquals(1, solution.findMin(new int[]{3, 5, 1}));
    }

    @Test
    void minLast() {
        assertEquals(0, solution.findMin(new int[]{2, 2, 2, 1, 0}));
    }
}
