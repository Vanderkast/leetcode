package com.vanderkast.leetcode.j53;

public class MaximumSubarrayDnC implements MaximumSubarray {
    int max = Integer.MIN_VALUE;

    @Override
    public int maxSubArray(int[] nums) {
        sumContinuous(nums, 0);
         return max;
    }

    private int sumContinuous(int[] nums, int i) {
        int n = nums[i++];
        int next = 0;
        if (i < nums.length)
            next = Math.max(0, sumContinuous(nums, i));
        max = Math.max(max, n + next);
        return n + next;
    }
}
