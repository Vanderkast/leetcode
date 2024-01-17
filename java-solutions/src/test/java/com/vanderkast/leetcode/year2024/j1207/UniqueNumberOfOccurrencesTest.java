package com.vanderkast.leetcode.year2024.j1207;

import org.junit.jupiter.api.Test;

import static com.vanderkast.leetcode.tools.Matrix.row;
import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberOfOccurrencesTest {
    private final UniqueNumberOfOccurrences solution = new UniqueNumberOfOccurrences();

    @Test
    void leetcodeExample1() {
        var arr = row("[1,2,2,1,1,3]");
        var expected = true;
        var actual = solution.uniqueOccurrences(arr);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var arr = row("[1,2]");
        var expected = false;
        var actual = solution.uniqueOccurrences(arr);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var arr = row("[-3,0,1,-3,1,1,1,-3,10,0]");
        var expected = true;
        var actual = solution.uniqueOccurrences(arr);
        assertEquals(expected, actual);
    }

    @Test
    void cornerValues() {
        var arr = row("[-1000, 0, 0, 1000, 1000, 1000]");
        var expected = true;
        var actual = solution.uniqueOccurrences(arr);
        assertEquals(expected, actual);
    }
}
