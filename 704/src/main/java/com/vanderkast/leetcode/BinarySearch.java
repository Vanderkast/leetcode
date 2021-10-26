package com.vanderkast.leetcode;

public class BinarySearch {
    public int search(int[] nums, int target) {
        var length = nums.length;
        if (length == 1)
            return nums[0] == target ? 0 : -1;
        var middle = length / 2;
        if (nums[middle] == target)
            return middle;
        int a, b;
        if (nums[middle] < target) {
            a = middle + 1;
            b = length - 1;
        } else {
            a = 0;
            b = middle - 1;
        }
        while (a != b) {
            middle = (a + b) / 2;
            if (nums[middle] == target)
                return middle;
            if (nums[middle] < target)
                a = middle + 1;
            else
                b = middle - 1;
        }
        return nums[a] == target ? a : -1;
    }
}
