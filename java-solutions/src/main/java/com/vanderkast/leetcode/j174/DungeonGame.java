package com.vanderkast.leetcode.j174;

public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length - 1;
        int n = dungeon[0].length - 1;
        dungeon[m][n] = dungeon[m][n] > 0 ? 1 : 1 - dungeon[m][n];
        for (int y = m - 1; y > -1; --y) {
            if (dungeon[y][n] >= dungeon[y + 1][n])
                dungeon[y][n] = 1;
            else
                dungeon[y][n] = dungeon[y + 1][n] - dungeon[y][n];
        }
        for (int x = n - 1; x > -1; --x) {
            if (dungeon[m][x] >= dungeon[m][x + 1])
                dungeon[m][x] = 1;
            else
                dungeon[m][x] = dungeon[m][x + 1] - dungeon[m][x];
        }
        for (int y = m - 1; y > -1; --y) {
            for (int x = n - 1; x > -1; --x) {
                m = Math.min(dungeon[y + 1][x], dungeon[y][x + 1]);
                if (dungeon[y][x] >= m)
                    dungeon[y][x] = 1;
                else
                    dungeon[y][x] = m - dungeon[y][x];
            }
        }
        return dungeon[0][0];
    }
}
