package com.vanderkast.leetcode.year2023.j1578;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumTimeToMakeRopeColorfulTest {
    private final MinimumTimeToMakeRopeColorful solution = new MinimumTimeToMakeRopeColorful();

    @Test
    void leetcodeExample1() {
        var colors = "abaac";
        var neededTime = new int[]{1, 2, 3, 4, 5};
        var expected = 3;
        var actual = solution.minCost(colors, neededTime);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var colors = "abc";
        var neededTime = new int[]{1, 2, 3};
        var expected = 0;
        var actual = solution.minCost(colors, neededTime);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var colors = "aabaa";
        var neededTime = new int[]{1,2,3,4,1};
        var expected = 2;
        var actual = solution.minCost(colors, neededTime);
        assertEquals(expected, actual);
    }

    @Test
    void oneBallon() {
        var colors = "a";
        var neededTime = new int[]{1};
        var expected = 0;
        var actual = solution.minCost(colors, neededTime);
        assertEquals(expected, actual);
    }
}
