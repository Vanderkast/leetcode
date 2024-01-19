package com.vanderkast.leetcode.year2024.j1289;

public class MinimumFallingPathSumII {
    public int minFallingPathSum(int[][] grid) {
        if (grid.length == 1)
            return grid[0][0];
        int prevMin = Integer.MAX_VALUE;
        int prevMinI = -1;
        int prevSubMin = Integer.MAX_VALUE;
        int n = grid.length - 1;
        for (int i = 0; i <= n; i++) {
            if (grid[0][i] < prevMin) {
                prevSubMin = prevMin;
                prevMin = grid[0][i];
                prevMinI = i;
            } else if (grid[0][i] < prevSubMin){
                prevSubMin = grid[0][i];
            }
        }
        int curMin = 0;
        for (int i = 1; i <= n; i++) {
            curMin = Integer.MAX_VALUE;
            int curMinI = -1;
            int curSubMin = Integer.MAX_VALUE;
            for (int j = 0; j <= n; j++) {
                if (j != prevMinI)
                    grid[i][j] += prevMin;
                else
                    grid[i][j] += prevSubMin;

                if (grid[i][j] < curMin) {
                    curSubMin = curMin;
                    curMin = grid[i][j];
                    curMinI = j;
                } else if (grid[i][j] < curSubMin){
                    curSubMin = grid[i][j];
                }
            }
            prevMin = curMin;
            prevMinI = curMinI;
            prevSubMin = curSubMin;
        }
        return curMin;
    }
}
