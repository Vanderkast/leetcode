package com.vanderkast.leetcode.j45;

public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0, end = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            if (farthest < i + nums[i])
                farthest = i + nums[i];
            if (i == end) {
                end = farthest;
                ++jumps;
            }
        }
        return jumps;
    }
}
