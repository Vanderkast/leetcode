package com.vanderkast.leetcode.year2024.j287;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        boolean[] repeats = new boolean[nums.length + 1];
        for(int n: nums) {
            if (repeats[n])
                return n;
            else
                repeats[n] = true;
        }
        return -1;
    }
}
