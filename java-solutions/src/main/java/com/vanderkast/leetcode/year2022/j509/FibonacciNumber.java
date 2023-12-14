package com.vanderkast.leetcode.year2022.j509;

public class FibonacciNumber {
    public int fib(int n) {
        int[] mem = new int[]{0, 1};
        for (int i = 1; i < n; i++) {
            mem[1] = mem[0] + mem[1];
            mem[0] = mem[1] - mem[0];
        }
        return n > 1 ? mem[1]: mem[n];
    }
}
