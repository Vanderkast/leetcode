package com.vanderkast.leetcode.year2024.j1768;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < len1 && i < len2) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
            ++i;
        }
        while (i < len1) {
            sb.append(word1.charAt(i));
            ++i;
        }
        while (i < len2) {
            sb.append(word2.charAt(i));
            ++i;
        }
        return sb.toString();
    }
}
