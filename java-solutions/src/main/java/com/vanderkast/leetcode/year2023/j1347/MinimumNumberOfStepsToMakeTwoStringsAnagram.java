package com.vanderkast.leetcode.year2023.j1347;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public int minSteps(String s, String t) {
        int[] box = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ++box[s.charAt(i) - 'a'];
        }
        for (int i = 0; i < t.length(); i++) {
            --box[t.charAt(i) - 'a'];
        }
        int diff = 0;
        for (int x : box)
            diff += x > 0 ? x : -x;
        return diff / 2;
    }
}
