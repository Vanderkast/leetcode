package com.vanderkast.leetcode.year2023.j1758;

public class MinimumChangesToMakeAlternatingBinaryString {
    public int minOperations(String s) {
        int leadingZero = 0;
        int leadingOne = 0;
        char cur;
        for (int i = 0; i < s.length(); i++) {
            cur = s.charAt(i);
            if ((i & 1) == 0) {
                if (cur == '1')
                    ++leadingZero;
                else
                    ++leadingOne;
            } else {
                if (cur == '0')
                    ++leadingZero;
                else
                    ++leadingOne;
            }
        }
        return Math.min(leadingOne, leadingZero);
    }
}
