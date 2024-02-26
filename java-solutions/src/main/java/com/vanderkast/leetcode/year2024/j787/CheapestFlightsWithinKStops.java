package com.vanderkast.leetcode.year2024.j787;

import net.vanderkast.leetcode.commons.Pair;

import java.util.*;

public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, Map<Integer, Integer>> toFromPrices = new HashMap<>();
        for (int[] flight : flights) {
            toFromPrices.putIfAbsent(flight[1], new HashMap<>());
            toFromPrices.get(flight[1]).put(flight[0], flight[2]);
        }
        int[] mins = new int[n];
        Arrays.fill(mins, Integer.MAX_VALUE);
        mins[dst] = 0;

        Queue<Pair<Integer, Integer>> prevLevel = new LinkedList<>();
        prevLevel.add(new Pair<>(dst, 0));
        Queue<Pair<Integer, Integer>> curLevel;
        for (int step = 0; step <= k; step++) {
            curLevel = new LinkedList<>();
            while (!prevLevel.isEmpty()) {
                var city = prevLevel.poll();
                Map<Integer, Integer> srcs = toFromPrices.get(city.getKey());
                if (srcs == null)
                    continue;
                for (Map.Entry<Integer, Integer> source : srcs.entrySet()) {
                    int sum = city.getValue() + source.getValue();
                    if (sum < mins[source.getKey()]) {
                        mins[source.getKey()] = sum;
                        curLevel.add(new Pair<>(source.getKey(), sum));
                    }
                }
            }
            prevLevel = curLevel;
        }
        return mins[src] == Integer.MAX_VALUE ? -1 : mins[src];
    }
}
