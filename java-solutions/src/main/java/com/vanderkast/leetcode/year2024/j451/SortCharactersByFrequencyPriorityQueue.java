package com.vanderkast.leetcode.year2024.j451;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequencyPriorityQueue extends SortCharactersByFrequency {
    @Override
    public String frequencySort(String s) {
        Map<Character, Integer> charOccurrences = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charOccurrences.put(s.charAt(i), charOccurrences.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>(
                Map.Entry.comparingByValue(Comparator.reverseOrder()));
        queue.addAll(charOccurrences.entrySet());
        StringBuilder sSorted = new StringBuilder();
        while (!queue.isEmpty()) {
            var co = queue.poll();
            sSorted.append(co.getKey().toString().repeat(co.getValue()));
        }
        return sSorted.toString();
    }
}
