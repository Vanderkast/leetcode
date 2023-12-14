package com.vanderkast.leetcode.year2023.j867;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int h = matrix.length;
        int w = matrix[0].length;
        int[][] transposed = new int[w][h];
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                transposed[x][y] = matrix[y][x];
            }
        }
        return transposed;
    }
}
