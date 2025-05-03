package com.vanderkast.leetcode.year2025.j1007;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumDominoRotationsForEqualRowTest {
    private final MinimumDominoRotationsForEqualRow solution = new MinimumDominoRotationsForEqualRow();

    @Test
    void leetcode1() {
        var tops = new int[]{2, 1, 2, 4, 2, 2};
        var bottoms = new int[]{5, 2, 6, 2, 3, 2};
        var expected = 2;

        var actual = solution.minDominoRotations(tops, bottoms);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var tops = new int[]{3, 5, 1, 2, 3};
        var bottoms = new int[]{3, 6, 3, 3, 4};
        var expected = -1;

        var actual = solution.minDominoRotations(tops, bottoms);

        assertEquals(expected, actual);
    }

    @Test
    void alreadyAligned() {
        var tops = new int[]{1, 2, 3, 4, 5};
        var bottoms = new int[]{6, 6, 6, 6, 6};
        var expected = 0;

        var actual = solution.minDominoRotations(tops, bottoms);

        assertEquals(expected, actual);
    }
}
