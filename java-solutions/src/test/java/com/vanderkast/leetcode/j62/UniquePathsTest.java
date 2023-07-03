package com.vanderkast.leetcode.j62;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {
    private final UniquePaths solution = new UniquePaths();

    @Test
    void leetcode1() {
        var m = 3;
        var n = 7;
        var expected = 28;
        var actual = solution.uniquePaths(m, n);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var m = 3;
        var n = 2;
        var expected = 3;
        var actual = solution.uniquePaths(m, n);
        assertEquals(expected, actual);
    }
}
