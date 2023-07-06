package com.vanderkast.leetcode.j209;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0, j = 0, i = 0;
        while (i < nums.length) {
            sum += nums[i];
            while (sum >= target) {
                minLen = Math.min(minLen, i - j+1);
                sum -= nums[j++];
            }
            ++i;
        }
        if (minLen == Integer.MAX_VALUE)
            return 0;
        return  minLen;
    }
}
