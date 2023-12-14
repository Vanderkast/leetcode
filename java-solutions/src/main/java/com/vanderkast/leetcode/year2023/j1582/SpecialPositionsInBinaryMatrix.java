package com.vanderkast.leetcode.year2023.j1582;

public class SpecialPositionsInBinaryMatrix {
    public int numSpecial(int[][] mat) {
        int h = mat.length;
        int w = mat[0].length;
        int[] specialsH = new int[h];
        int[] specialsW = new int[w];
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (mat[y][x] == 1) {
                    specialsH[y] += 1;
                    specialsW[x] += 1;
                }
            }
        }
        int count = 0;
        for (int y = 0; y < h; y++) {
            if (specialsH[y] == 1) {
                for (int x = 0; x < w; x++) {
                    if (mat[y][x] == 1 && specialsW[x] == 1) {
                        ++count;
                    }
                }
            }
        }
        return count;
    }
}
