package com.vanderkast.leetcode.year2024.j931;

public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length - 1;
        for (int y = 1; y <= n; y++) {
            for (int x = 0; x <= n; x++) {
                if (x == 0)
                    matrix[y][x] += Math.min(matrix[y - 1][x], matrix[y - 1][x + 1]);
                else if (x == n)
                    matrix[y][x] += Math.min(matrix[y - 1][x - 1], matrix[y - 1][x]);
                else
                    matrix[y][x] += Math.min(Math.min(matrix[y - 1][x - 1], matrix[y - 1][x]), matrix[y - 1][x + 1]);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int x = 0; x <= n; x++)
            min = Math.min(min, matrix[n][x]);
        return min;
    }
}
