package com.vanderkast.leetcode.year2023.j2706;

public class BuyTwoChocolates {
    public int buyChoco(int[] prices, int money) {
        int a = money, b = a;
        for (int x : prices) {
            if (x < a) {
                b = a;
                a = x;
            } else if (x < b) {
                b = x;
            }
        }
        return a + b <= money ? money - a - b : money;
    }
}
