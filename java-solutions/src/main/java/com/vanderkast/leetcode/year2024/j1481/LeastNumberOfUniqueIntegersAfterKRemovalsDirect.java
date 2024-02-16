package com.vanderkast.leetcode.year2024.j1481;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeastNumberOfUniqueIntegersAfterKRemovalsDirect extends LeastNumberOfUniqueIntegersAfterKRemovals {
    @Override
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int x : arr) {
            Integer prev = occurrences.putIfAbsent(x, 1);
            if (prev != null)
                occurrences.put(x, ++prev);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Map.Entry.comparingByValue());
        queue.addAll(occurrences.entrySet());
        while (!queue.isEmpty() && k > 0) {
            int v = queue.poll().getValue();
            if (v > k)
                return queue.size() + 1;
            k -= v;
        }
        return queue.size();
    }
}
