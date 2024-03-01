package com.vanderkast.leetcode.year2024.j2864;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int zeros = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                ++ones;
            else
                ++zeros;
        }
        return "1".repeat(ones - 1) + "0".repeat(zeros) + "1";
    }
}
