package com.vanderkast.leetcode.year2023.j1758;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumChangesToMakeAlternatingBinaryStringTest {
    private final MinimumChangesToMakeAlternatingBinaryString solution = new MinimumChangesToMakeAlternatingBinaryString();

    @Test
    void leetcodeExample1() {
        var given = "0100";
        var expected = 1;
        var actual = solution.minOperations(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var given = "10";
        var expected = 0;
        var actual = solution.minOperations(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var given = "1111";
        var expected = 2;
        var actual = solution.minOperations(given);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var given = "01";
        var expected = 0;
        var actual = solution.minOperations(given);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var given = "0000";
        var expected = 2;
        var actual = solution.minOperations(given);
        assertEquals(expected, actual);
    }
}
