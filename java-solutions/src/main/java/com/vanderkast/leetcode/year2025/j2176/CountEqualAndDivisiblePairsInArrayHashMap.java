package com.vanderkast.leetcode.year2025.j2176;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountEqualAndDivisiblePairsInArrayHashMap implements CountEqualAndDivisiblePairsInArray {

    public int countPairs(int[] nums, int k) {
        var map = new HashMap<Integer, List<Integer>>();
        var len = nums.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            for (int pos : map.get(nums[i])) {
                if ((i * pos) % k == 0)
                    ++count;
            }
            map.get(nums[i]).add(i);
        }
        return count;
    }
}
