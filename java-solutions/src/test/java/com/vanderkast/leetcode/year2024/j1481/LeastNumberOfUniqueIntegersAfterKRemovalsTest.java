package com.vanderkast.leetcode.year2024.j1481;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class LeastNumberOfUniqueIntegersAfterKRemovalsTest {
    private final LeastNumberOfUniqueIntegersAfterKRemovals solution;

    LeastNumberOfUniqueIntegersAfterKRemovalsTest(LeastNumberOfUniqueIntegersAfterKRemovals solution) {
        this.solution = solution;
    }

    @Test
    void leetcodeExample1() {
        var arr = new int[]{5, 5, 4};
        var k = 1;
        var expected = 1;
        var actual = solution.findLeastNumOfUniqueInts(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var arr = new int[]{4, 3, 1, 1, 3, 3, 2};
        var k = 3;
        var expected = 2;
        var actual = solution.findLeastNumOfUniqueInts(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void singleElement() {
        var arr = new int[]{1};
        var k = 1;
        var expected = 0;
        var actual = solution.findLeastNumOfUniqueInts(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void kIsZero() {
        var arr = new int[]{1, 2};
        var k = 0;
        var expected = 2;
        var actual = solution.findLeastNumOfUniqueInts(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void removeAll() {
        var arr = new int[]{1, 2, 3};
        var k = 3;
        var expected = 0;
        var actual = solution.findLeastNumOfUniqueInts(arr, k);
        assertEquals(expected, actual);
    }
}
