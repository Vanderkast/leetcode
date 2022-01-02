package com.vanderkast.leetcode.j1010;

public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] mod60 = new int[60];
        int count = 0;
        int box;
        for (int i : time) {
            box = i % 60;
            if(box == 0 || box == 30)
                count += mod60[box];
            mod60[box] += 1;
        }
        for (int i = 1; i < 30; i++)
            count += mod60[i] * mod60[60 - i];
        return count;
    }
}
