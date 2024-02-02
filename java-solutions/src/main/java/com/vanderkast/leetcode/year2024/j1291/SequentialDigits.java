package com.vanderkast.leetcode.year2024.j1291;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        int mask = 1;
        int a0 = 1;
        int ai = 9;
        List<Integer> arr = new ArrayList<>();
        while (a0 < high) {
            if (ai % 10 == 0) {
                mask = mask * 10 + 1;
                a0 = a0 * 10 + a0 % 10 + 1;
                ai = a0;
            }
            if (low <= ai && ai <= high)
                arr.add(ai);
            ai += mask;
        }
        return arr;
    }
}
