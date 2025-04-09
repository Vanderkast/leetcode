package com.vanderkast.leetcode.year2025.j3375;

public class MinimumOperationsToMakeArrayValuesEqualToK {
    public int minOperations(int[] nums, int k) {
        var has = new boolean[101];
        for (int num : nums) {
            has[num] = true;
            if (num < k)
                return -1;
        }

        int operations = 0;
        for (int i = 100; i > k; --i) {
            if (has[i])
                ++operations;
        }
        return operations;
    }
}
