package com.vanderkast.leetcode.year2024.j1071;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {
    private final GreatestCommonDivisorOfStrings solution;

    GreatestCommonDivisorOfStringsTest(GreatestCommonDivisorOfStrings solution) {
        this.solution = solution;
    }

    @Test
    void leetcodeExample1() {
        var str1 = "ABCABC";
        var str2 = "ABC";
        var expected = "ABC";
        var actual = solution.gcdOfStrings(str1, str2);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var str1 = "ABABAB";
        var str2 = "ABAB";
        var expected = "AB";
        var actual = solution.gcdOfStrings(str1, str2);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample() {
        var str1 = "LEET";
        var str2 = "CODE";
        var expected = "";
        var actual = solution.gcdOfStrings(str1, str2);
        assertEquals(expected, actual);
    }

    @Test
    void equalStrings() {
        var str1 = "LEET";
        var str2 = "LEET";
        var expected = "LEET";
        var actual = solution.gcdOfStrings(str1, str2);
        assertEquals(expected, actual);
    }
}
