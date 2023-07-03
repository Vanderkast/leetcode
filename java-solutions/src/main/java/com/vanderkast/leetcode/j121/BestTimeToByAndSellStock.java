package com.vanderkast.leetcode.j121;

public class BestTimeToByAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
               profit = prices[j] - prices[i];
               if (profit > maxProfit)
                   maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
