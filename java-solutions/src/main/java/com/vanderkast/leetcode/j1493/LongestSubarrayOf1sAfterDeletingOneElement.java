package com.vanderkast.leetcode.j1493;

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int longest = -1, pA = 0, pB = 0;
        boolean zeroFaced = false;
        boolean zeroDeleted = false;
        for (int n : nums) {
            if (n == 1) {
                if (zeroDeleted)
                    ++pB;
                else
                    ++pA;
            } else {
                zeroFaced = true;
                if (zeroDeleted) {
                    if (pA + pB > longest)
                        longest = pA + pB;
                    pA = pB;
                    pB = 0;
                } else {
                    if (pA > 0)
                        zeroDeleted = true;
                }
            }
        }
        return Math.max(pA + pB - (zeroFaced ? 0 : 1), longest);
    }
}
