package com.vanderkast.leetcode.year2023.j1155;

public class NumberOfDiceRollsWithTargetSum {
    public int numRollsToTarget(int n, int k, int target) {
        Integer[][] memo = new Integer[n][k];
        if (n * k < target)
            return 0;
        if (n == 1)
            return 1;
        int count = 0;
        for (int i = 1; i < k; i++)
            count += numRollsToTarget(n - 1, k, target - i);
        return count % 1_000_000_007;
    }

    int count() {

    }
}
