package com.vanderkast.leetcode.j70;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] values = new int[]{1, 2};
        for (int i = 2; i < n; i++) {
            values[i % 2] = values[0] + values[1];
        }
        return values[(n - 1) % 2];
    }
}
