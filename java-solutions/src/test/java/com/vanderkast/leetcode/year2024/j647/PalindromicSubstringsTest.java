package com.vanderkast.leetcode.year2024.j647;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class PalindromicSubstringsTest {
    private final PalindromicSubstrings solution;

    PalindromicSubstringsTest(PalindromicSubstrings solution) {
        this.solution = solution;
    }

    @Test
    void leetcodeExample1() {
        var s = "abc";
        var expected = 3;
        var actual = solution.countSubstrings(s);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var s = "aaa";
        var expected = 6;
        var actual = solution.countSubstrings(s);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var s = "aabaa";
        var expected = 9;
        var actual = solution.countSubstrings(s);
        assertEquals(expected, actual);
    }

    @Test
    void oneLetter() {
        var s = "a";
        var expected = 1;
        var actual = solution.countSubstrings(s);
        assertEquals(expected, actual);
    }
}
