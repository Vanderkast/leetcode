package com.vanderkast.leetcode.year2024.j1043;

public class PartitionArrayForMaximumSum {
    public int maxSumAfterPartitioning(int[] a, int k) {
        int len = a.length;
        int[] m = new int[len + 1];
        m[0] = 0;
        m[1] = a[0];
        int lMax;
        for (int i = 2; i <= len; ++i) {
            m[i] = m[i - 1] + a[i - 1];
            lMax = a[i - 1];
            for (int j = 1; j <= i && j <= k; j++) {
                lMax = Math.max(lMax, a[i - j]);
                m[i] = Math.max(m[i], m[i - j] + lMax * j);
            }
        }
        return m[len];
    }
}
