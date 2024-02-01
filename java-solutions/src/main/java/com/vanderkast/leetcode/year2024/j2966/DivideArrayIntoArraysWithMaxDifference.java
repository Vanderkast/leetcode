package com.vanderkast.leetcode.year2024.j2966;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public int[][] divideArray(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        int[][] arrs = new int[len / 3][];
        for (int i = 0; i < len; i += 3) {
            arrs[i / 3] = new int[]{nums[i], nums[i + 1], nums[i + 2]};
            if (nums[i + 2] - nums[i] > k)
                return new int[][]{};
        }
        return arrs;
    }
}
