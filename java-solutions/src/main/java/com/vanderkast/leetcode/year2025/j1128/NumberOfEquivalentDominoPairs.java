package com.vanderkast.leetcode.year2025.j1128;

public class NumberOfEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        var index = new int[9][9];
        int count = 0;
        for (int[] domino : dominoes) {
            int left = domino[0] - 1;
            int right = domino[1] - 1;
            if (left <= right) {
                count += index[left][right];
                ++index[left][right];
            } else {
                count += index[right][left];
                ++index[right][left];
            }
        }

        return count;
    }
}
