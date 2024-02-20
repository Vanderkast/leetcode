package com.vanderkast.leetcode.year2024.j268;

import java.util.Arrays;

public class MissingNumberSort extends MissingNumber {
    @Override
    public int missingNumber(int[] nums) {
        if (nums.length == 1)
            return 1 - nums[0];
        Arrays.sort(nums);
        if (nums[0] != 0)
            return 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                return nums[i] - 1;
            }
        }
        return nums.length;
    }
}
