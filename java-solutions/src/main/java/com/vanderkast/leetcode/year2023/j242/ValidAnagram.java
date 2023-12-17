package com.vanderkast.leetcode.year2023.j242;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int len = s.length();
        int[] sChars = new int[26];
        for (int i = 0; i < len; i++) {
            ++sChars[s.charAt(i) - 'a'];
            --sChars[t.charAt(i) - 'a'];
        }
        int i = 0;
        while (i < 26 && sChars[i] == 0) {
            ++i;
        }
        return i == 26;
    }
}
