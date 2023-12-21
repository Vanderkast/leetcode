package com.vanderkast.leetcode.year2023.j1637;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WidestVerticalAreaBetweenTwoPointsContainingNoPointsTest {
    private final WidestVerticalAreaBetweenTwoPointsContainingNoPoints
            solution = new WidestVerticalAreaBetweenTwoPointsContainingNoPoints();

    @Test
    void leetcodeExample1() {
        var given = points(8, 7, 9, 9, 7, 4, 9, 7);
        var expected = 1;
        var actual = solution.maxWidthOfVerticalArea(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var given = points(3, 1, 9, 0, 1, 0, 1, 4, 5, 3, 8, 8);
        var expected = 3;
        var actual = solution.maxWidthOfVerticalArea(given);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var given = points(-1, -1, 1, 1);
        var expected = 2;
        var actual = solution.maxWidthOfVerticalArea(given);
        assertEquals(expected, actual);
    }

    private int[][] points(int... coords) {
        if ((coords.length & 1) == 1)
            throw new IllegalArgumentException();
        int len = coords.length / 2;
        int[][] points = new int[len][2];
        for (int i = 0; i < len; i++)
            points[i] = new int[]{coords[2 * i], coords[2 * i + 1]};
        return points;
    }
}
