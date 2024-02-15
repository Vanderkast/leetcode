package com.vanderkast.leetcode.year2024.j2971;

import java.util.Arrays;

public class FindPolygonWithTheLargestPerimeter {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for (int x : nums)
            sum += x;
        int i = nums.length - 1;
        while (i > 1 && sum - nums[i] <= nums[i]) {
            sum -= nums[i];
            --i;
        }
        return i < 2 ? -1 : sum;
    }
}
