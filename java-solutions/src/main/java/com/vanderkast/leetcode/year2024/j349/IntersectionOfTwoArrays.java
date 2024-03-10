package com.vanderkast.leetcode.year2024.j349;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] occurrences = new boolean[1001];
        for (int x : nums1)
            occurrences[x] = true;
        int[] intersection = new int[1001];
        int count = 0;
        for (int x : nums2) {
            if (occurrences[x]) {
                intersection[count++] = x;
                occurrences[x] = false;
            }
        }
        return Arrays.copyOf(intersection, count);
    }
}
