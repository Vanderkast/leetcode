package com.vanderkast.leetcode.j997;

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        boolean[] trusts = new boolean[n + 1];
        int[] trustedByCount = new int[n + 1];
        for (int[] relation : trust) {
            trusts[relation[0]] = true;
            ++trustedByCount[relation[1]];
        }
        for (int i = 1; i <= n; i++) {
            if (!trusts[i] && trustedByCount[i] == n - 1)
                return i;
        }
        return -1;
    }
}
