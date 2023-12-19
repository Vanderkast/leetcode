package com.vanderkast.leetcode.year2023.j661;

public class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {
        int h = img.length;
        int w = img[0].length;
        int[][] res = new int[h][w];
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int sum = 0;
                int neighbors = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (y + i > -1 && y + i < h && x + j > -1 && x + j < w) {
                            sum += img[y + i][x + j];
                            ++neighbors;
                        }
                    }
                }
                res[y][x] = sum / neighbors;
            }
        }
        return res;
    }
}
