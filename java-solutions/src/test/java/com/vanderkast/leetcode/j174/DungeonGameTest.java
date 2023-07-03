package com.vanderkast.leetcode.j174;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DungeonGameTest {
    private final DungeonGame solution = new DungeonGame();

    @Test
    void leetcode1() {
        var dungeon = new int[][]{
                new int[]{-2, -3, 3},
                new int[]{-5, -10, 1},
                new int[]{10, 30, -5},
        };
        var expected = 7;
        var actual = solution.calculateMinimumHP(dungeon);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        var dungeon = new int[][]{
                new int[]{0},
        };
        var expected = 1;
        var actual = solution.calculateMinimumHP(dungeon);
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        var dungeon = new int[][]{
                new int[]{1},
        };
        var expected = 1;
        var actual = solution.calculateMinimumHP(dungeon);
        assertEquals(expected, actual);
    }
}
