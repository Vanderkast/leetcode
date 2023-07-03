package com.vanderkast.leetcode.j392;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {
    private final IsSubsequence solution = new IsSubsequence();

    @Test
    void leetcode1() {
        var s = "abc";
        var t = "ahbgdc";
        var expected = true;
        var actual = solution.isSubsequence(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var s = "axc";
        var t = "ahbgdc";
        var expected = false;
        var actual = solution.isSubsequence(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var s = "acc";
        var t = "ac";
        var expected = false;
        var actual = solution.isSubsequence(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var s = "";
        var t = "ahbgdc";
        var expected = true;
        var actual = solution.isSubsequence(s, t);
        assertEquals(expected, actual);
    }
}
