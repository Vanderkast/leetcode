package com.vanderkast.leetcode.year2024.j1768;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {
    private final MergeStringsAlternately solution = new MergeStringsAlternately();

    @Test
    void leetcodeExample1() {
        var w1 = "abc";
        var w2 = "pqr";
        var expected = "apbqcr";
        var actual = solution.mergeAlternately(w1, w2);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var w1 = "ab";
        var w2 = "pqrs";
        var expected = "apbqrs";
        var actual = solution.mergeAlternately(w1, w2);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var w1 = "abcd";
        var w2 = "pq";
        var expected = "apbqcd";
        var actual = solution.mergeAlternately(w1, w2);
        assertEquals(expected, actual);
    }
}
