package com.vanderkast.leetcode.year2023.j263;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumberTest {
    private final UglyNumber solution = new UglyNumber();

    @Test
    void leetcodeExample1() {
        var given = 6;
        var expected = true;
        var actual = solution.isUgly(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var given = 1;
        var expected = true;
        var actual = solution.isUgly(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var given = 14;
        var expected = false;
        var actual = solution.isUgly(given);
        assertEquals(expected, actual);
    }

    @Test
    void testZero() {
        var given = 0;
        var expected = false;
        var actual = solution.isUgly(given);
        assertEquals(expected, actual);
    }

    @Test
    void testMinus3() {
        var given = -3;
        var expected = false;
        var actual = solution.isUgly(given);
        assertEquals(expected, actual);
    }
}
