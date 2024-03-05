package com.vanderkast.leetcode.year2024.j1750;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumLengthOfStringAfterDeletingSimilarEndsTest {
    private final MinimumLengthOfStringAfterDeletingSimilarEnds solution = new MinimumLengthOfStringAfterDeletingSimilarEnds();

    @Test
    void leetcodeExample1() {
        var s = "ca";
        var expected = 2;
        var actual = solution.minimumLength(s);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var s = "cabaabac";
        var expected = 0;
        var actual = solution.minimumLength(s);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var s = "aabccabba";
        var expected = 3;
        var actual = solution.minimumLength(s);
        assertEquals(expected, actual);
    }
}
