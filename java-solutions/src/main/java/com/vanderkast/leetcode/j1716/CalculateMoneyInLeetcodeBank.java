package com.vanderkast.leetcode.j1716;

public class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        int fw = n / 7; // full weeks
        int ld = n % 7; // days in the last week
        return fw * (1 + fw) / 2 // mondays
                + fw * (3 + fw) / 2 // tuesdays
                + fw * (5 + fw) / 2 // wednesdays
                + fw * (7 + fw) / 2 // thursdays
                + fw * (9 + fw) / 2 // fridays
                + fw * (11 + fw) / 2 // saturdays
                + fw * (13 + fw) / 2 // sundays
                + ld * (fw * 2 + ld + 1) / 2; // last partial week
    }
}
