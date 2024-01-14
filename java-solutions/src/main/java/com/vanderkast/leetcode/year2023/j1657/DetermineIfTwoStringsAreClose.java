package com.vanderkast.leetcode.year2023.j1657;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String a, String b) {
        if (a.length() != b.length())
            return false;
        int[] ac = new int[26], bc = new int[26];
        for (int i = 0; i < b.length(); i++) {
            ++ac[a.charAt(i) - 'a'];
            ++bc[b.charAt(i) - 'a'];
        }
        for (int i = 0; i < 26; i++) {
            if (ac[i] == 0 && bc[i] > 0 || ac[i] > 0 && bc[i] == 0)
                return false;
        }
        Arrays.sort(ac);
        Arrays.sort(bc);
        for (int i = 0; i < 26; i++) {
            if (ac[i] != bc[i])
                return false;
        }
        return true;
    }
}
