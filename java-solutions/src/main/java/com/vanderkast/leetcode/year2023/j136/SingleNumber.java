package com.vanderkast.leetcode.year2023.j136;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int x = ~0;
        for (int n : nums)
            x ^= ~n;
        return x;
    }
}
