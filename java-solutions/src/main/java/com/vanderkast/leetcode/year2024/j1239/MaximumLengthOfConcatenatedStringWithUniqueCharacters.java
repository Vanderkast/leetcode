package com.vanderkast.leetcode.year2024.j1239;

import java.util.List;

public class MaximumLengthOfConcatenatedStringWithUniqueCharacters {
    public int maxLength(List<String> arr) {
        return maxLength(arr, new int[arr.size()], 0, 0, 0);
    }

    int maxLength(List<String> arr, int[] memo, int sumCode, int len, int i) {
        if (i == memo.length)
            return len;
        if (memo[i] == 0)
            memo[i] = strToCode(arr.get(i));
        int l1 = maxLength(arr, memo, sumCode, len, i + 1); // arr[i] is not added to the final string
        int l2 = 0;
        if (memo[i] > -1 && (sumCode & memo[i]) == 0) // arr[i] is added to the final string if final string will contain no duplicates
            l2 = maxLength(arr, memo, sumCode + memo[i], len + arr.get(i).length(), i + 1);
        return Math.max(l1, l2);
    }

    int strToCode(String s) {
        int bits = 0;
        for (int i = 0; i < s.length(); i++) {
            int b = 1 << (s.charAt(i) - 'a');
            if ((bits & b) > 0)
                return -1;
            bits += b;
        }
        return bits;
    }
}
