package com.vanderkast.leetcode.year2024.j1071;

import java.util.Arrays;

public class GreatestCommonDivisorOfStringsBrute extends GreatestCommonDivisorOfStrings {

    @Override
    public String gcdOfStrings(String str1, String str2) {
        int minLen = Math.min(str1.length(), str2.length());
        char[] str1c = str1.toCharArray();
        char[] str2c = str2.toCharArray();
        char[] maxDivisor = new char[]{};
        char[] prefix;
        for (int i = 1; i <= minLen; i++) {
            prefix = Arrays.copyOf(str1c, i);
            if (isDivisor(str1c, prefix) && isDivisor(str2c, prefix))
                maxDivisor = prefix;
        }
        return String.valueOf(maxDivisor);
    }

    boolean isDivisor(char[] a, char[] d) {
        if (a.length % d.length != 0)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != d[i % d.length])
                return false;
        }
        return true;
    }
}
