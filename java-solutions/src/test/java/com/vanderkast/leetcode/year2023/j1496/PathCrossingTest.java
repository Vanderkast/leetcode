package com.vanderkast.leetcode.year2023.j1496;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathCrossingTest {
    private final PathCrossing solution = new PathCrossing();

    @Test
    void leetcodeExample1() {
        var given = "NES";
        var expected = false;
        var actual = solution.isPathCrossing(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var given = "NESWW";
        var expected = true;
        var actual = solution.isPathCrossing(given);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var given = "NS";
        var expected = true;
        var actual = solution.isPathCrossing(given);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var given = "WE";
        var expected = true;
        var actual = solution.isPathCrossing(given);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        var given = "SN";
        var expected = true;
        var actual = solution.isPathCrossing(given);
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        var given = "EW";
        var expected = true;
        var actual = solution.isPathCrossing(given);
        assertEquals(expected, actual);
    }

    @Test
    void max() {
        var given = new StringBuilder();
        for (int i = 0; i < 10001; i++)
            given.append("N");
        for (int i = 0; i < 10001; i++)
            given.append("E");
        for (int i = 0; i < 10001; i++)
            given.append("S");
        for (int i = 0; i < 10000; i++)
            given.append("W");
        var expected = false;
        var actual = solution.isPathCrossing(given.toString());
        assertEquals(expected, actual);
    }
}
