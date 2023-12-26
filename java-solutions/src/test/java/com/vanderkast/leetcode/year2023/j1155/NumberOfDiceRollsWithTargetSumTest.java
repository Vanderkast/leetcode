package com.vanderkast.leetcode.year2023.j1155;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDiceRollsWithTargetSumTest {
    private final NumberOfDiceRollsWithTargetSum solution = new NumberOfDiceRollsWithTargetSum();

    @Test
    void leetcodeExample1() {
        var n = 1;
        var k = 6;
        var target = 3;
        var expected = 1;
        var actual = solution.numRollsToTarget(n, k , target);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var n = 2;
        var k = 6;
        var target = 7;
        var expected = 6;
        var actual = solution.numRollsToTarget(n, k , target);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var n = 30;
        var k = 30;
        var target = 500;
        var expected = 1;
        var actual = solution.numRollsToTarget(n, k , target);
        assertEquals(expected, actual);
    }

    @Test
    void impossibleMax() {
        var n = 2;
        var k = 6;
        var target = 13;
        var expected = 0;
        var actual = solution.numRollsToTarget(n, k , target);
        assertEquals(expected, actual);
    }

    @Test
    void impossibleMin() {
        var n = 2;
        var k = 6;
        var target = 1;
        var expected = 0;
        var actual = solution.numRollsToTarget(n, k , target);
        assertEquals(expected, actual);
    }

    @Test
    void maximumsOnly() {
        var n = 2;
        var k = 6;
        var target = 12;
        var expected = 1;
        var actual = solution.numRollsToTarget(n, k , target);
        assertEquals(expected, actual);
    }

    @Test
    void minimumsOnly() {
        var n = 2;
        var k = 6;
        var target = 2;
        var expected = 1;
        var actual = solution.numRollsToTarget(n, k , target);
        assertEquals(expected, actual);
    }
}
