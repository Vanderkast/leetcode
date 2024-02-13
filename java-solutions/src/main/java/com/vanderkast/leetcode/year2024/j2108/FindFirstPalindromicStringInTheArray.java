package com.vanderkast.leetcode.year2024.j2108;

public class FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        for (String w : words) {
            if (isPalindrome(w))
                return w;
        }
        return "";
    }

    boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i - j < 1; ++i, --j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
