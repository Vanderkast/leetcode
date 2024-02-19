package com.vanderkast.leetcode.year2024.j231;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {
    private final PowerOfTwo solution = new PowerOfTwo();

    @Test
    void leetcodeExample1() {
        var n = 1;
        var expected = true;
        var actual = solution.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var n = 16;
        var expected = true;
        var actual = solution.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var n = 3;
        var expected = false;
        var actual = solution.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    @Test
    void zero() {
        var n = 0;
        var expected = false;
        var actual = solution.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    @Test
    void twentyForth() {
        var n = 24;
        var expected = false;
        var actual = solution.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }

    @Test
    void negative() {
        var n = -16;
        var expected = false;
        var actual = solution.isPowerOfTwo(n);
        assertEquals(expected, actual);
    }
}
