package com.vanderkast.leetcode.j392;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length())
            return false;
        if (s.length() == 0)
            return true;
        int si = 0;
        for (char tc: t.toCharArray()) {
            if (tc == s.charAt(si))
                ++si;
            if (si == s.length())
                return true;
        }
        return false;
    }
}
