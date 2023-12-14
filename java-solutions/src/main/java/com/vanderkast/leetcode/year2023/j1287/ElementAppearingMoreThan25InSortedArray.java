package com.vanderkast.leetcode.year2023.j1287;

public class ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        int threshold = arr.length / 4;
        int prev = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; ++i) {
            if (prev == arr[i])
                ++count;
            else
                count = 1;
            if (count > threshold)
                return arr[i];
            prev = arr[i];
        }
        return prev;
    }
}
