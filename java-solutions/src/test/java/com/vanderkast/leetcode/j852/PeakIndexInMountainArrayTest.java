package com.vanderkast.leetcode.j852;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakIndexInMountainArrayTest {
    private final PeakIndexInMountainArray solution = new PeakIndexInMountainArray();

    @Test
    void leetcodeExample1() {
        var arr = new int[]{0, 1, 0};
        var expected = 1;
        var actual = solution.peakIndexInMountainArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var arr = new int[]{0, 2, 1, 0};
        var expected = 1;
        var actual = solution.peakIndexInMountainArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var arr = new int[]{0, 10, 5, 2};
        var expected = 1;
        var actual = solution.peakIndexInMountainArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    void leftBorder() {
        var arr = new int[]{3, 2, 1};
        var expected = 0;
        var actual = solution.peakIndexInMountainArray(arr);
        assertEquals(expected, actual);
    }

    @Test
    void rightBorder() {
        var arr = new int[]{1, 2, 3};
        var expected = 2;
        var actual = solution.peakIndexInMountainArray(arr);
        assertEquals(expected, actual);
    }
}
