package com.vanderkast.leetcode.year2022.j121;

public class BestTimeToByAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int x: prices) {
            if (x < min)
                min = x;
            if (x - min > profit)
                profit = x - min;
        }
        return profit;
    }
}
