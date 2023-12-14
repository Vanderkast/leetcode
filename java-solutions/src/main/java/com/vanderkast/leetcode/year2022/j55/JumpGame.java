package com.vanderkast.leetcode.year2022.j55;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int lastReachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if(lastReachable < i)
                return false;
            if(lastReachable < i + nums[i])
                lastReachable = i + nums[i];
            if(lastReachable > nums.length - 2)
                return true;
        }
        return false;
    }
}
