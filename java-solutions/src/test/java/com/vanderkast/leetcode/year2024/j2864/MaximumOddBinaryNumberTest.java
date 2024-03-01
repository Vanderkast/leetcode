package com.vanderkast.leetcode.year2024.j2864;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumOddBinaryNumberTest {
    private final MaximumOddBinaryNumber solution = new MaximumOddBinaryNumber();

    @Test
    void leetcodeExample1() {
        var s = "010";
        var expected = "001";
        var actual = solution.maximumOddBinaryNumber(s);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var s = "0101";
        var expected = "1001";
        var actual = solution.maximumOddBinaryNumber(s);
        assertEquals(expected, actual);
    }

    @Test
    void justOne() {
        var s = "1";
        var expected = "1";
        var actual = solution.maximumOddBinaryNumber(s);
        assertEquals(expected, actual);
    }
}
