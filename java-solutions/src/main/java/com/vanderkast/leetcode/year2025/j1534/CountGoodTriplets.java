package com.vanderkast.leetcode.year2025.j1534;

public class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        var count = 0;
        var iMax = arr.length - 2;
        var jMax = arr.length - 1;
        var kMax = arr.length;
        for (int i = 0; i < iMax; i++) {
            for (int j = i + 1; j < jMax; j++) {
                if (Math.abs(arr[i] - arr[j]) > a)
                    continue;
                for (int k = j + 1; k < kMax; k++) {
                    if (Math.abs(arr[i] - arr[k]) <= c && Math.abs(arr[j] - arr[k]) <= b)
                        ++count;
                }
            }
        }
        return count;
    }
}
