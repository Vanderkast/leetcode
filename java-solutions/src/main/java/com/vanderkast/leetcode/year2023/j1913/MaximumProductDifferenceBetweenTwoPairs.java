package com.vanderkast.leetcode.year2023.j1913;

public class MaximumProductDifferenceBetweenTwoPairs {
    public int maxProductDifference(int[] nums) {
        int[] mins = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        int[] maxs = new int[]{0, 0};

        for (int num : nums) {
            if (num > maxs[0]) {
                if (num > maxs[1]) {
                    maxs[0] = maxs[1];
                    maxs[1] = num;
                } else
                    maxs[0] = num;
            }
            if (num < mins[1]) {
                if (num < mins[0]) {
                    mins[1] = mins[0];
                    mins[0] = num;
                } else
                    mins[1] = num;
            }
        }

        return maxs[0] * maxs[1] - mins[0] * mins[1];
    }
}
