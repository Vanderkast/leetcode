package com.vanderkast.leetcode.year2025.j2537;

import java.util.HashMap;

public class CountNumberOfGoodSubarrays {
    public long countGood(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0;
        int len = nums.length;
        int pairs = 0;
        int i = 0;
        int j = 1;
        map.put(nums[0], 1);
        while (i < j) {
            while (j < len && pairs < k) {
                Integer prev = map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                if (prev != null)
                    pairs += prev;
                ++j;
            }
            if (pairs < k)
                return count;
            else
                count += len - j + 1;
            map.put(nums[i], map.get(nums[i]) - 1);
            pairs -= map.get(nums[i]);
            ++i;
        }
        return count;
    }
}
