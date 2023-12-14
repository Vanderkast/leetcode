package com.vanderkast.leetcode.year2023.j2482;

public class DifferenceBetweenOnesAndZerosInRowAndColumn {
    public int[][] onesMinusZeros(int[][] grid) {
        int h = grid.length, w = grid[0].length;
        int[] diffRow = new int[h];
        int[] diffCol = new int[w];
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int mod = grid[y][x] == 1 ? 1 : -1;
                diffRow[y] += mod;
                diffCol[x] += mod;
            }
        }
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                grid[y][x] = diffRow[y] + diffCol[x];
            }
        }
        return grid;
    }
}
