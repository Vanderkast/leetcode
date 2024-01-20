package com.vanderkast.leetcode.year2024.j496;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ngeN = new int[10001];
        Deque<Integer> nge = new ArrayDeque<>();
        nge.push(nums2[0]);
        for (int i = 1; i < nums2.length; i++) {
            if (nge.peek() > nums2[i]) {
                nge.push(nums2[i]);
            } else {
                while (!nge.isEmpty() && nge.peek() < nums2[i])
                    ngeN[nge.pop()] = nums2[i];
                nge.push(nums2[i]);
            }
        }
        while (!nge.isEmpty())
            ngeN[nge.pop()] = -1;
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = ngeN[nums1[i]];
        }
        return nums1;
    }
}
