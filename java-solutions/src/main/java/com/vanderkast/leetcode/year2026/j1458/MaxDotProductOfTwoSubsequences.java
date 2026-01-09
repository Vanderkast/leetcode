package com.vanderkast.leetcode.year2026.j1458;

public class MaxDotProductOfTwoSubsequences {
    public int maxDotProduct(int[] a, int[] b) {
        var m = a.length - 1;
        var n = b.length - 1;
        var table = new int[a.length][b.length];
        for (var i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                table[i][j] = a[m - i] * b[n - j];
                if (i > 0 && j > 0)
                    table[i][j] += Math.max(0, table[i - 1][j - 1]);
                if (i > 0)
                    table[i][j] = Math.max(table[i][j], table[i - 1][j]);
                if (j > 0)
                    table[i][j] = Math.max(table[i][j], table[i][j - 1]);
            }
        }
        return table[m][n];
    }
}
