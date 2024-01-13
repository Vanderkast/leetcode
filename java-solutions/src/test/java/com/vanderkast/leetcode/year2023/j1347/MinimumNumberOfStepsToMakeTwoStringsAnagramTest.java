package com.vanderkast.leetcode.year2023.j1347;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfStepsToMakeTwoStringsAnagramTest {
    private final MinimumNumberOfStepsToMakeTwoStringsAnagram solution
            = new MinimumNumberOfStepsToMakeTwoStringsAnagram();

    @Test
    void leetcodeExample1() {
        var s = "bab";
        var t = "aba";
        var expected = 1;
        var actual = solution.minSteps(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var s = "leetcode";
        var t = "practice";
        var expected = 5;
        var actual = solution.minSteps(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var s = "anagram";
        var t = "mangaar";
        var expected = 0;
        var actual = solution.minSteps(s, t);
        assertEquals(expected, actual);
    }
}
