package com.vanderkast.leetcode.year2024.j647;

public class PalindromicSubstringsFa extends PalindromicSubstrings {
    public int countSubstrings(String s) {
        int len = s.length();
        Integer[][] memo = new Integer[len][len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (memo[i][j] != null) {
                    count += memo[i][j];
                }else
                    count += isPalindromicSubstrings(s, memo, i, j);
            }
        }
        return count;
    }

    private int isPalindromicSubstrings(String s, Integer[][] memo, int i, int j) {
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        if(i == j) {
            memo[i][j] = 1;
            return 1;
        }
        if (j - i == 1 || isPalindromicSubstrings(s, memo, i + 1, j - 1) == 1) {
            memo[i][j] = s.charAt(i) == s.charAt(j) ? 1 : 0;
            return memo[i][j];
        } else {
            memo[i][j] = 0;
            return 0;
        }
    }
}
