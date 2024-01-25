package com.vanderkast.leetcode.year2024.j1143;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int[][] maxes = new int[aLen + 1][bLen + 1];
        for (int i = 1; i <= aLen; i++) {
            for (int j = 1; j <= bLen; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    maxes[i][j] = maxes[i - 1][j - 1] + 1;
                else
                    maxes[i][j] = Math.max(maxes[i - 1][j], maxes[i][j - 1]);
            }
        }
        return maxes[aLen][bLen];
    }
}
