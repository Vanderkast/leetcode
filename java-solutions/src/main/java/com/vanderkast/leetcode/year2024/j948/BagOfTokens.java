package com.vanderkast.leetcode.year2024.j948;

import java.util.Arrays;

public class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int upI = 0;
        int downI = tokens.length - 1;
        int maxScore = 0;
        int score = 0;
        while (upI <= downI) {
            if (power >= tokens[upI]) {
                power -= tokens[upI++];
                ++score;
            } else if (score > 0) {
                maxScore = Math.max(maxScore, score);
                power += tokens[downI--];
                --score;
            } else
                return maxScore;
        }
        return Math.max(maxScore, score);
    }
}
