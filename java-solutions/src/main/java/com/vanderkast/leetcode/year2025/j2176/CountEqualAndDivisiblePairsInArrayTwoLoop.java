package com.vanderkast.leetcode.year2025.j2176;

public class CountEqualAndDivisiblePairsInArrayTwoLoop implements CountEqualAndDivisiblePairsInArray {
    @Override
    public int countPairs(int[] nums, int k) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0)
                    ++count;
            }
        }
        return count;
    }
}
