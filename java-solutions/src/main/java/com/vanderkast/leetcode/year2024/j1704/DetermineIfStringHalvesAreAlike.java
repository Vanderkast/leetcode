package com.vanderkast.leetcode.year2024.j1704;

import java.util.Set;

public class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        Set<Character> chars = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int count = 0;
        int i = 0;
        for (; i < s.length() / 2; i++) {
            if (chars.contains(s.charAt(i)))
                ++count;
        }
        for (; i < s.length(); i++) {
            if (chars.contains(s.charAt(i)))
                --count;
        }
        return count == 0;
    }
}
