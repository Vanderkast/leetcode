package com.vanderkast.leetcode.j852;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int a = 0, b = arr.length;
        int max = b - 1;
        int i;
        do {
            i = (a + b) / 2;
            if (i == max || i == 0 || arr[i - 1] < arr[i] && arr[i] > arr[i + 1])
                return i;
            if (arr[i - 1] < arr[i] && arr[i] < arr[i + 1])
                a = i;
            if (arr[i - 1] > arr[i] && arr[i] > arr[i + 1])
                b = i;
        } while (a != b);
        return i;
    }
}
