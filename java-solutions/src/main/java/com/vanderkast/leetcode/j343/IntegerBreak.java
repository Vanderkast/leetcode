package com.vanderkast.leetcode.j343;

public class IntegerBreak {
    public int integerBreak(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        if (n < 5)
            return n;
        int a = n % 3;
        if (a == 0)
            return (int) Math.pow(3, n / 3);
        if (a == 1)
            return 4 * (int) (Math.pow(3, n / 3 - 1));
        return 2 * (int) (Math.pow(3, n / 3));
    }
}
