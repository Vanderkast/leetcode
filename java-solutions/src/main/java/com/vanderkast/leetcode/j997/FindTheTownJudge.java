package com.vanderkast.leetcode.j997;

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        if(n == 1)
            return 1;
        boolean[] trusts = new boolean[n + 1];
        int[] trustedByCount = new int[n + 1];
        trustedByCount[0] = -1; // in first cell of array we will place judge candidate number
        for (int[] relation : trust) {
            trusts[relation[0]] = true;
            if(++trustedByCount[relation[1]] == n - 1) {
                trustedByCount[0] = relation[1];
                if(trusts[trustedByCount[0]])
                    return -1;
            }
        }
        if(trustedByCount[0] == -1)
            return -1;
        return trusts[trustedByCount[0]] ? -1 : trustedByCount[0];
    }
}
