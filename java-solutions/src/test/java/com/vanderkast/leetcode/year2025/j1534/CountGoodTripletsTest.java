package com.vanderkast.leetcode.year2025.j1534;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountGoodTripletsTest {
    private final CountGoodTriplets solution = new CountGoodTriplets();

    @Test
    void leetcode1() {
        var arr = new int[]{3, 0, 1, 1, 9, 7};
        var a = 7;
        var b = 2;
        var c = 3;
        var expected = 4;

        var actual = solution.countGoodTriplets(arr, a, b, c);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var arr = new int[]{1, 1, 2, 2, 3};
        var a = 0;
        var b = 0;
        var c = 1;
        var expected = 0;

        var actual = solution.countGoodTriplets(arr, a, b, c);

        assertEquals(expected, actual);
    }
}
