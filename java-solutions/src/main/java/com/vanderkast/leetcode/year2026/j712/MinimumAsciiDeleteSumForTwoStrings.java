package com.vanderkast.leetcode.year2026.j712;

public class MinimumAsciiDeleteSumForTwoStrings {
    public int minimumDeleteSum(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        var table = new int[s1Len + 1][s2Len + 1];
        for (int i = 1; i <= s1Len; i++)
            table[i][0] = table[i - 1][0] + s1.charAt(i - 1);
        for (int j = 1; j <= s2Len; j++)
            table[0][j] = table[0][j - 1] + s2.charAt(j - 1);
        for (int i = 1; i <= s1Len; i++) {
            int s1i = s1.charAt(i - 1);
            for (int j = 1; j <= s2Len; j++) {
                int s2j = s2.charAt(j - 1);
                table[i][j] = Math.min(s2j + table[i][j - 1], s1i + table[i - 1][j]);
                if (s1i == s2j) {
                    table[i][j] = Math.min(table[i][j], table[i - 1][j - 1]);
                } else
                    table[i][j] = Math.min(table[i][j], s1i + s2j + table[i - 1][j - 1]);
            }
        }
        return table[s1Len][s2Len];
//        for (int i = 0; i < s2Len; i++)
//            table[i + 1] = table[i] + s2.charAt(i);
//        for (int i = 0; i < s1Len; i++) {
//            var subTable = new int[s2Len + 1];
//            subTable[0] = table[0] + s1.charAt(i);
//            for (int j = 1; j <= s2Len; j++) {
//                subTable[j] = Math.min(s1.charAt(i) + table[j], s2.charAt(j - 1) + subTable[j - 1]);
//                if (s1.charAt(i) == s2.charAt(j - 1)) {
//                    subTable[j] = Math.min(subTable[j], table[j - 1]);
//                } else {
//                    subTable[j] = Math.min(subTable[j], s1.charAt(i) + s2.charAt(j - 1) + table[j - 1]);
//                }
//            }
//            table = subTable;
//        }
    }
}
