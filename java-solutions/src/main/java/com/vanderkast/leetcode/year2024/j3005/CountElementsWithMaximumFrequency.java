package com.vanderkast.leetcode.year2024.j3005;

public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = 0;
        int count = 0;
        int[] occurrences = new int[101];
        for (int x : nums) {
            if (++occurrences[x] == maxFreq)
                count += occurrences[x];
            else if (occurrences[x] > maxFreq) {
                maxFreq = occurrences[x];
                count = occurrences[x];
            }
        }
        return count;
    }
}
