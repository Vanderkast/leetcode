package com.vanderkast.leetcode.year2023.j91;

public class DecodeWays {

    public int numDecodings(String s) {
        int prev = s.charAt(0) - '0';
        if (prev == 0)
            return 0;
        if (s.length() == 1)
            return 1;
        int paired = 0;
        int single = 1;
        int cur;
        for (int i = 1; i < s.length(); ++i) {
            cur = s.charAt(i) - '0';
            if (cur == 0) {
                if (prev == 0 || prev > 2)
                    return 0;
                paired = single;
                single = 0;
            } else if (prev == 0 || (prev == 2 && cur > 6) || prev > 2) {
                single += paired;
                paired = 0;
            } else {
                single += paired;
                paired = single - paired;
            }
            prev = cur;
        }
        return paired + single;
    }
}
