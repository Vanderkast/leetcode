package com.vanderkast.leetcode.year2025.j2140;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolvingQuestionsWithBrainpowerTest {
    private final SolvingQuestionsWithBrainpower solution = new SolvingQuestionsWithBrainpower();

    @Test
    void leetcode1() {
        var given = new int[][]{new int[]{3, 2}, new int[]{4, 3}, new int[]{4, 4}, new int[]{2, 5}};
        var expected = 5;

        var actual = solution.mostPoints(given);

        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var given = new int[][]{new int[]{1, 1}, new int[]{2, 2}, new int[]{3, 3}, new int[]{4, 4}, new int[]{5, 5}};
        var expected = 7;

        var actual = solution.mostPoints(given);

        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var given = new int[][]{
                new int[]{100, 1},
                new int[]{100, 1},
                new int[]{100, 1},
                new int[]{100, 1},
                new int[]{100, 1}
        };
        var expected = 300;

        var actual = solution.mostPoints(given);

        assertEquals(expected, actual);
    }
}
