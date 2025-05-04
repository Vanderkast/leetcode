package com.vanderkast.leetcode.year2025.j1128;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfEquivalentDominoPairsTest {
    private final NumberOfEquivalentDominoPairs solution = new NumberOfEquivalentDominoPairs();

    @Test
    void leetcode1() {
        int[][] given = new int[][]{
                new int[]{1, 2},
                new int[]{2, 1},
                new int[]{3, 4},
                new int[]{5, 6}
        };
        var expected = 1;

        var actual = solution.numEquivDominoPairs(given);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        int[][] given = new int[][]{
                new int[]{1, 2},
                new int[]{1, 2},
                new int[]{1, 1},
                new int[]{1, 2},
                new int[]{2, 2}
        };
        var expected = 3;

        var actual = solution.numEquivDominoPairs(given);

        assertEquals(expected, actual);
    }
}
