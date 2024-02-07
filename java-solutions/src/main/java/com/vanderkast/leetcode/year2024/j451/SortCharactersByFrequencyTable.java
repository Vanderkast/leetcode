package com.vanderkast.leetcode.year2024.j451;

public class SortCharactersByFrequencyTable extends SortCharactersByFrequency {
    @Override
    public String frequencySort(String s) {
        char[] res = s.toCharArray();
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++)
            ++freq[res[i]];
        for (int i = 0; i < s.length();) {
            char cmax = 'a' - 1;
            for (int j = 0; j < 128; j++)
                if (freq[cmax] < freq[j]) cmax = (char) j;
            while (freq[cmax] > 0) {
                res[i++] = cmax;
                --freq[cmax];
            }
        }
        return new String(res);
    }
}
