package com.vanderkast.leetcode.year2022.j1220;

public class CountVowelsPermutation {
    public int countVowelPermutation(int n) {
        long[][] a = new long[][]{
                new long[]{1, 1, 1, 1, 1}, // a e i o u
                new long[]{3, 2, 2, 1, 2}};
        int j = n - 1;
        for (int i = 3; i <= n; i++) {
            j = i % 2;
            a[1 - j][0] = (a[j][1] + a[j][2] + a[j][4]) % 1_000_000_007L;
            a[1 - j][1] = (a[j][0] + a[j][2]) % 1_000_000_007L;
            a[1 - j][2] = (a[j][1] + a[j][3]) % 1_000_000_007L;
            a[1 - j][3] = a[j][2];
            a[1 - j][4] = (a[j][2] + a[j][3]) % 1_000_000_007L;
        }
        if (n > 2)
            j = 1 - n % 2;
        long sum = 0;
        for (long v : a[j])
            sum += v % 1_000_000_007L;
        return (int) (sum % 1_000_000_007L);
    }
}
