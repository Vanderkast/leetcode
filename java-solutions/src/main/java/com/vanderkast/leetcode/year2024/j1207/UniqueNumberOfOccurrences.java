package com.vanderkast.leetcode.year2024.j1207;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int[] occurrences = new int[2001];
        boolean[] index = new boolean[1001];
        for (int x : arr)
            ++occurrences[x + 1000];
        for (int o : occurrences) {
            if (o != 0) {
                if (index[o])
                    return false;
                index[o] = true;
            }
        }
        return true;
    }
}
