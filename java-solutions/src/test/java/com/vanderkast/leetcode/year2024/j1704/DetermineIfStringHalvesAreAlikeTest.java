package com.vanderkast.leetcode.year2024.j1704;

import com.vanderkast.leetcode.year2024.j1704.DetermineIfStringHalvesAreAlike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineIfStringHalvesAreAlikeTest {
    private final DetermineIfStringHalvesAreAlike solution = new DetermineIfStringHalvesAreAlike();

    @Test
    void leetcodeExample1() {
        var s = "book";
        var expected = true;
        var actual = solution.halvesAreAlike(s);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var s = "textbook";
        var expected = false;
        var actual = solution.halvesAreAlike(s);
        assertEquals(expected, actual);
    }
}
