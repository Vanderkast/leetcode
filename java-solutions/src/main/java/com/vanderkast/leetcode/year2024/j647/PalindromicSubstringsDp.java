package com.vanderkast.leetcode.year2024.j647;

public class PalindromicSubstringsDp extends PalindromicSubstrings {
    @Override
    public int countSubstrings(String s) {
        int sLen = s.length();
        boolean[][] palindrome = new boolean[sLen][sLen];
        int count = 0;
        for (int n = 1; n <= sLen; n++) {
            for (int i = 0; i < sLen - n + 1; i++) {
                if (s.charAt(i) == s.charAt(i + n - 1) && (n <= 2 || palindrome[i + 1][i + n - 2])) {
                    palindrome[i][i + n - 1] = true;
                    ++count;
                }
            }
        }
        return count;
    }
}
