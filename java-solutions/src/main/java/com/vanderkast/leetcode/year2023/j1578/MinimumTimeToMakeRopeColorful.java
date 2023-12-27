package com.vanderkast.leetcode.year2023.j1578;

public class MinimumTimeToMakeRopeColorful {
    public int minCost(String colors, int[] neededTime) {
        int prev = 0;
        int cost = 0;
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(prev) == colors.charAt(i)) {
                if (neededTime[prev] > neededTime[i])
                    cost += neededTime[i];
                else {
                    cost += neededTime[prev];
                    prev = i;
                }
            } else
                prev = i;
        }
        return cost;
    }
}
