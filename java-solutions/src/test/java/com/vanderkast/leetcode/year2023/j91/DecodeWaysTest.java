package com.vanderkast.leetcode.year2023.j91;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeWaysTest {
    private final DecodeWays solution = new DecodeWays();

    @Test
    void leetcodeExample1() {
        var given = "12";
        var expected = 2;
        var actual = solution.numDecodings(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var given = "226";
        var expected = 3;
        var actual = solution.numDecodings(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var given = "06";
        var expected = 0;
        var actual = solution.numDecodings(given);
        assertEquals(expected, actual);
    }

    @Test
    void justOne() {
        var given = "1";
        var expected = 1;
        var actual = solution.numDecodings(given);
        assertEquals(expected, actual);
    }

    @Test
    void justZero() {
        var given = "0";
        var expected = 0;
        var actual = solution.numDecodings(given);
        assertEquals(expected, actual);
    }

    @Test
    void twentySeven() {
        var given = "27";
        var expected = 1;
        var actual = solution.numDecodings(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode232() {
        var given = "2101";
        var expected = 1;
        var actual = solution.numDecodings(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode236() {
        var given = "1123";
        var expected = 5;
        var actual = solution.numDecodings(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode229() {
        var given = "123123";
        var expected = 9;
        var actual = solution.numDecodings(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode230() {
        var given = "230";
        var expected = 0;
        var actual = solution.numDecodings(given);
        assertEquals(expected, actual);
    }
}
