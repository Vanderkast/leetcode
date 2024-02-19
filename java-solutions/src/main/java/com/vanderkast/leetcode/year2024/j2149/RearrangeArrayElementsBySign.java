package com.vanderkast.leetcode.year2024.j2149;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int pI = 0;
        int nI = 1;
        for (int x : nums) {
            if (x > 0) {
                res[pI] = x;
                pI += 2;
            } else {
                res[nI] = x;
                nI += 2;
            }
        }
        return res;
    }
}
