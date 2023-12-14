package com.vanderkast.leetcode.year2021.j496;

import java.util.HashMap;
import java.util.Stack;

/**
 * O(n) solution via Monotonic Stack
 */
public class NextGreaterElementISolution implements NextGreaterElementI {
    @Override
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int iLen = nums1.length;
        HashMap<Integer, Integer> nums1Map = new HashMap<>(iLen);
        var ans = new int[iLen];
        for (int i = 0; i < iLen; ++i) {
            nums1Map.put(nums1[i], i);
            ans[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();
        Integer tmp;
        for (int j = nums2.length - 1; j > -1; --j) {
            tmp = nums1Map.get(nums2[j]);
            if (tmp != null) {
                while (!stack.empty() && stack.peek() <= nums2[j]) {
                    stack.pop();
                }
                if (!stack.empty())
                    ans[tmp] = stack.peek();
            }
            stack.push(nums2[j]);
        }
        return ans;
    }
}
