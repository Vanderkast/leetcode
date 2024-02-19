package com.vanderkast.leetcode.year2024.j231;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n < 1)
            return false;
        while (n > 1) {
            if ((n & 1) == 1)
                return false;
            n >>= 1;
        }
        return true;
    }
}
