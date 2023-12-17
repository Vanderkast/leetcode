package com.vanderkast.leetcode.j242;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    private final ValidAnagram solution = new ValidAnagram();

    @Test
    void leetcodeExample1() {
        var s = "anagram";
        var t = "nagaram";
        var expected = true;
        var actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var s = "rat";
        var t = "car";
        var expected = false;
        var actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var s = "aa";
        var t = "aaa";
        var expected = false;
        var actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var s = "aaa";
        var t = "aa";
        var expected = false;
        var actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode31() {
        var s = "nl";
        var t = "cx";
        var expected = false;
        var actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }
}
