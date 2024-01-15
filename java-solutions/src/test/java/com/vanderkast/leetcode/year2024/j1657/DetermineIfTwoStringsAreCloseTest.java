package com.vanderkast.leetcode.year2024.j1657;

import com.vanderkast.leetcode.year2024.j1657.DetermineIfTwoStringsAreClose;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineIfTwoStringsAreCloseTest {
    private final DetermineIfTwoStringsAreClose solution = new DetermineIfTwoStringsAreClose();

    @Test
    void leetcodeExample1() {
        var a = "abc";
        var b = "bca";
        var expected = true;
        var actual = solution.closeStrings(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var a = "a";
        var b = "aa";
        var expected = false;
        var actual = solution.closeStrings(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var a = "cabbba";
        var b = "abbccc";
        var expected = true;
        var actual = solution.closeStrings(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeTest132() {
        var a = "abbzzca";
        var b = "babzzcz";
        var expected = false;
        var actual = solution.closeStrings(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeTest148() {
        var a = "aaabbbbccddeeeeefffff";
        var b = "aaaaabbcccdddeeeeffff";
        var expected = false;
        var actual = solution.closeStrings(a, b);
        assertEquals(expected, actual);
    }
}
