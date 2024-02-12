package com.vanderkast.leetcode.year2024.j169;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numOccurrences = new HashMap<>();
        for (int x: nums) {
            Integer v = numOccurrences.get(x);
            numOccurrences.put(x, v == null ? 1 : v + 1);
        }
        int majority = nums.length/ 2;
        for (Map.Entry<Integer, Integer> e : numOccurrences.entrySet()) {
            if (e.getValue() > majority)
                return e.getKey();
        }
        return -1;
    }
}
