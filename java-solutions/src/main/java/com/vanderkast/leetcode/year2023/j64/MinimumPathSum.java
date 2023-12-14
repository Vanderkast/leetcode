package com.vanderkast.leetcode.year2023.j64;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for (int y = 1; y < n; y++)
            grid[y][0] += grid[y - 1][0];

        for (int x = 1; x < m; x++)
            grid[0][x] += grid[0][x - 1];

        for (int y = 1; y < n; y++) {
            for (int x = 1; x < m; x++) {
                grid[y][x] += Math.min(grid[y - 1][x], grid[y][x - 1]);
            }
        }
        return grid[n - 1][m - 1];
    }
}
