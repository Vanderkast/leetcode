package com.vanderkast.leetcode.year2025.j1007;

public class MinimumDominoRotationsForEqualRow {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        var len = tops.length;
        var nTop = new int[7];
        var nBottom = new int[7];
        var doubles = new int[7];

        for (int i = 0; i < len; i++) {
            ++nTop[tops[i]];
            ++nBottom[bottoms[i]];
            if (tops[i] == bottoms[i]) {
                ++doubles[tops[i]];
            }
        }

        for (int i = 1; i < 7; i++) {
            if (nTop[i] + nBottom[i] - doubles[i] >= len) {
                return Math.min(nTop[i], nBottom[i]) - doubles[i];
            }
        }
        return -1;
    }
}
