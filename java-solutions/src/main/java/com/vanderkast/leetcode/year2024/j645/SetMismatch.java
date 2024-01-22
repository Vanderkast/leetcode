package com.vanderkast.leetcode.year2024.j645;

import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] repetitions = new int[nums.length + 1];
        for (int n: nums)
            ++repetitions[n];
        int[] res = new int[2];
        for (int i = 1; i <= nums.length; i++) {
            if (repetitions[i] == 2)
                res[0] = i;
            else if (repetitions[i] == 0)
                res[1] = i;
        }
        return res;
    }
}
