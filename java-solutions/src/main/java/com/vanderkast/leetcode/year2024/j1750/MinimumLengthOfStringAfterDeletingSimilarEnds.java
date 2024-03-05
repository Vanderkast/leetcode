package com.vanderkast.leetcode.year2024.j1750;

public class MinimumLengthOfStringAfterDeletingSimilarEnds {
    public int minimumLength(String s) {
        int l = 0;
        int r = s.length() - 1;
        char lc, rc;
        while (l < r) {
            lc = s.charAt(l);
            rc = s.charAt(r);
            if (lc != rc)
                break;
            do {
                ++l;
            } while (l < r && lc == s.charAt(l));
            do {
                --r;
            } while (l < r && rc == s.charAt(r));
        }
        return r - l + 1;
    }
}
