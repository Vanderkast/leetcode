package com.vanderkast.leetcode.year2023.j1422;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumScoreAfterSplittingStringTest {
    private final MaximumScoreAfterSplittingString solution = new MaximumScoreAfterSplittingString();

    @Test
    void leetcodeExample1() {
        var given = "011101";
        var expected = 5;
        var actual = solution.maxScore(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var given = "00111";
        var expected = 5;
        var actual = solution.maxScore(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var given = "1111";
        var expected = 3;
        var actual = solution.maxScore(given);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var given = "01";
        var expected = 2;
        var actual = solution.maxScore(given);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var given = "10";
        var expected = 0;
        var actual = solution.maxScore(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode61() {
        var given = "1011011";
        var expected = 5;
        var actual = solution.maxScore(given);
        assertEquals(expected, actual);
    }
}
