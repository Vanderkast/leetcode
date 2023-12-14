package com.vanderkast.leetcode.year2023.j389;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceTest {
    private final FindTheDifference solution = new FindTheDifference();

    @Test
    void leetcodeExample1() {
        var s = "abcd";
        var t ="abcde";
        var expected = 'e';
        var actual = solution.findTheDifference(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var s = "";
        var t = "y";
        var expected = 'y';
        var actual = solution.findTheDifference(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode4() {
        var s = "a";
        var t = "aa";
        var expected = 'a';
        var actual = solution.findTheDifference(s, t);
        assertEquals(expected, actual);
    }
}
