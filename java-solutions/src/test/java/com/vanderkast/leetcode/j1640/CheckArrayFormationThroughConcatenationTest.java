package com.vanderkast.leetcode.j1640;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckArrayFormationThroughConcatenationTest {
    private final CheckArrayFormationThroughConcatenation solution = new CheckArrayFormationThroughConcatenation();

    @Test
    void leetcode1() {
        // given
        var arr = arr(15, 88);
        var pieces = dArr(
                arr(88),
                arr(15));
        // when
        var actual = solution.canFormArray(arr, pieces);
        // then
        assertTrue(actual);
    }

    @Test
    void leetcode2() {
        // given
        var arr = arr(49, 18, 16);
        var pieces = dArr(arr(16, 18, 49));
        // when
        var actual = solution.canFormArray(arr, pieces);
        // then
        assertFalse(actual);
    }

    @Test
    void leetcode3() {
        // given
        var arr = arr(91, 4, 64, 78);
        var pieces = dArr(
                arr(78),
                arr(4, 64),
                arr(91));
        // when
        var actual = solution.canFormArray(arr, pieces);
        // then
        assertTrue(actual);
    }

    @Test
    void singleElementOk() {
        // given
        var arr = arr(322);
        var pieces = dArr(arr);
        // when
        var actual = solution.canFormArray(arr, pieces);
        // then
        assertTrue(actual);
    }

    @Test
    void singleElementFail() {
        // given
        var arr = arr(911);
        var pieces = dArr(arr(1));
        // when
        var actual = solution.canFormArray(arr, pieces);
        // then
        assertFalse(actual);
    }

    @Test
    void leetcode5() {
        // given
        var arr = arr(37, 69, 3, 74, 46);
        var pieces = dArr(arr(37, 69, 3, 74, 46));
        // when
        var actual = solution.canFormArray(arr, pieces);
        // then
        assertTrue(actual);
    }

    private int[] arr(int... values) {
        return values;
    }

    private int[][] dArr(int[]... arrs) {
        return arrs;
    }
}
