package com.vanderkast.leetcode.year2023.j1422;

public class MaximumScoreAfterSplittingString {
    public int maxScore(String s) {
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                ++ones;
        }
        int zeros;
        int max;
        if (s.charAt(0) == '0') {
            zeros = 1;
            max = ones + 1;
        } else {
            zeros = 0;
            --ones;
            max = ones;
        }
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                ++zeros;
                if (max < zeros + ones) {
                    max = zeros + ones;
                }
            } else
                --ones;
        }
        return max;
    }
}
