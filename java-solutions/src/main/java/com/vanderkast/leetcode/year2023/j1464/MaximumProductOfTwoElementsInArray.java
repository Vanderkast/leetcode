package com.vanderkast.leetcode.year2023.j1464;

public class MaximumProductOfTwoElementsInArray {
    public int maxProduct(int[] nums) {
        int m1 = 0, m2 = 0;
        for (int x : nums) {
            if (x > m1) {
                m2 = m1;
                m1 = x;
            } else if (x > m2) {
                m2 = x;
            }
        }
        return (m1 - 1) * (m2 - 1);
    }
}
