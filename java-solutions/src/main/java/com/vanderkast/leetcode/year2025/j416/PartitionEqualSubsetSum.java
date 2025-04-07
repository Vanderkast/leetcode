package com.vanderkast.leetcode.year2025.j416;

public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        var total = 0;
        for (int num : nums) {
            total += num;
        }
        if (total % 2 != 0)
            return false;

        var target = total / 2;
        var dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = target; i >= num; --i) {
                dp[i] |= dp[i - num];
            }
        }

        return dp[target];
    }
}
