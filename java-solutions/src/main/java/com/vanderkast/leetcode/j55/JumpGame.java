package com.vanderkast.leetcode.j55;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int lastReachable = nums[0];
        if(lastReachable > nums.length - 2)
            return true;
        int current = 0;
        while (current < lastReachable) { // if we reach the last reachable position, then there are no ways to move further
            if(current + nums[current] > nums.length - 2)
                // if the longest jump we can do leads to a position
                // which from we can jump to the finish, then finish is reachable
                return true;
            if(lastReachable < current + nums[current])
                lastReachable = current + nums[current];
            ++current;
        }
        return false;
    }
}
