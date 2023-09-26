package com.vanderkast.leetcode.j389;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) % 26] += 1;
        }
        char box;
        for (int i = 0; i < t.length(); i++) {
            box = t.charAt(i);
            if (--chars[box % 26] < 0)
                return box;
        }
        return 's';
    }
}
