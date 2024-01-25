package com.vanderkast.leetcode.year2024.j1143;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {
    private final LongestCommonSubsequence solution = new LongestCommonSubsequence();

    @Test
    void leetcodeExample1() {
        var a = "abcde";
        var b = "ace";
        var expected = 3;
        var actual = solution.longestCommonSubsequence(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var a = "abc";
        var b = "abc";
        var expected = 3;
        var actual = solution.longestCommonSubsequence(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var a = "abc";
        var b = "def";
        var expected = 0;
        var actual = solution.longestCommonSubsequence(a, b);
        assertEquals(expected, actual);
    }
}
