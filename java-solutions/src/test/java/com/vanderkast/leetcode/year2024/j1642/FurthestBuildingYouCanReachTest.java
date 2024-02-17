package com.vanderkast.leetcode.year2024.j1642;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FurthestBuildingYouCanReachTest {
    private final FurthestBuildingYouCanReach solution = new FurthestBuildingYouCanReach();

    @Test
    void leetcodeExample1() {
        var heights = new int[]{4, 2, 7, 6, 9, 14, 12};
        var bricks = 5;
        var ladders = 1;
        var expected = 4;
        var actual = solution.furthestBuilding(heights, bricks, ladders);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var heights = new int[]{4, 12, 2, 7, 3, 18, 20, 3, 19};
        var bricks = 10;
        var ladders = 2;
        var expected = 7;
        var actual = solution.furthestBuilding(heights, bricks, ladders);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var heights = new int[]{14, 3, 19, 3};
        var bricks = 17;
        var ladders = 0;
        var expected = 3;
        var actual = solution.furthestBuilding(heights, bricks, ladders);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeTest72() {
        var heights = new int[]{1, 2};
        var bricks = 0;
        var ladders = 0;
        var expected = 0;
        var actual = solution.furthestBuilding(heights, bricks, ladders);
        assertEquals(expected, actual);
    }

    @Test
    void oneBuilding() {
        var heights = new int[]{10, 10};
        var bricks = 0;
        var ladders = 0;
        var expected = 1;
        var actual = solution.furthestBuilding(heights, bricks, ladders);
        assertEquals(expected, actual);
    }
}
