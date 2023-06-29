package com.vanderkast.leetcode.j746;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; ++i)
            cost[i] += cost[i - 1] < cost[i - 2] ? cost[i - 1] : cost[i - 2];
        return cost[cost.length - 1] < cost[cost.length - 2] ? cost[cost.length - 1] : cost[cost.length - 2];
    }
}
