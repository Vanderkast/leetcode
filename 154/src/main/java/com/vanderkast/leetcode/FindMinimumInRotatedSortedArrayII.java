package com.vanderkast.leetcode;

public class FindMinimumInRotatedSortedArrayII {

    public int findMin(int[] nums) {
        // todo implement
        throw new UnsupportedOperationException();
    }

    public int _findMin(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        int cursor = nums[0], iNext = 1;

        while (iNext < nums.length && cursor >= nums[iNext]) {
            cursor = nums[iNext++];
        }

        return cursor;
    }
}
