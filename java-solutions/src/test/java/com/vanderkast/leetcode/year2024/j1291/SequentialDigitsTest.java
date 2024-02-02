package com.vanderkast.leetcode.year2024.j1291;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SequentialDigitsTest {
    private final SequentialDigits solution = new SequentialDigits();

    @Test
    void leetcodeExample1() {
        var low = 100;
        var high = 300;
        var expected = List.of(123, 234);
        var actual = solution.sequentialDigits(low, high);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var low = 1000;
        var high = 13000;
        var expected = List.of(1234,2345,3456,4567,5678,6789,12345);
        var actual = solution.sequentialDigits(low, high);
        assertEquals(expected, actual);
    }

    @Test
    void inbounds() {
        var low = 1234;
        var high = 12345;
        var expected = List.of(1234,2345,3456,4567,5678,6789,12345);
        var actual = solution.sequentialDigits(low, high);
        assertEquals(expected, actual);
    }
}
