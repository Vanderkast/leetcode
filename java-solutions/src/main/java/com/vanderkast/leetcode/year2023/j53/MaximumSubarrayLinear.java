package com.vanderkast.leetcode.year2023.j53;

public class MaximumSubarrayLinear implements MaximumSubarray {
    @Override
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int x : nums) {
            cur += x;
            max = Math.max(cur, max);
            if (cur < 0)
                cur = 0;
        }
        return max;
    }
}
