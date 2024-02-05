package com.vanderkast.leetcode.year2024.j387;

import java.util.Arrays;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        int[] indexes = new int[26];
        Arrays.fill(indexes, -2);
        int index;
        for (int i = 0; i < s.length(); i++) {
            index = s.charAt(i) - 'a';
            if (indexes[index] == -2)
                indexes[index] = i;
            else if (indexes[index] > -1)
                indexes[index] = -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i : indexes) {
            if (i > -1 && i < min)
                min = i;
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
