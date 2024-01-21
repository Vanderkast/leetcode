package com.vanderkast.leetcode.year2024.j1918;

public class HouseRobber {
    public int rob(int[] nums) {
        int[] prev = new int[]{0, 0};
        for (int n : nums)
            prev = new int[]{prev[1] + n, Math.max(prev[0], prev[1])};
        return Math.max(prev[0], prev[1]);
    }
}
