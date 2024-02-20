package com.vanderkast.leetcode.year2024.j268;

public class MissingNumberImpl extends MissingNumber {
    @Override
    public int missingNumber(int[] nums) {
        int total = (nums.length * (nums.length + 1)) / 2;
        for (int n : nums)
            total -= n;
        return total;
    }
}
