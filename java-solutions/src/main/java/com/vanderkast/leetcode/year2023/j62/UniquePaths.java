package com.vanderkast.leetcode.year2023.j62;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] tmp = new int[n];
        for (int x = 0; x < n; x++)
            tmp[x] = 1;
        for (int y = 1; y < m; y++)
            for (int x = 1; x < n; x++)
                tmp[x] = tmp[x - 1] + tmp[x];
        return tmp[n - 1];
    }
}
