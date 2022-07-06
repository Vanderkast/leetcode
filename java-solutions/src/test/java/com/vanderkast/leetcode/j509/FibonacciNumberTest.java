package com.vanderkast.leetcode.j509;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {
    private final FibonacciNumber solution = new FibonacciNumber();

    @Test
    void leetcode1() {
        int n = 2;
        int actual = solution.fib(n);
        assertEquals(1, actual);
    }

    @Test
    void leetcode2() {
        int n = 3;
        int actual = solution.fib(n);
        assertEquals(2, actual);
    }

    @Test
    void leetcode3() {
        int n = 4;
        int actual = solution.fib(n);
        assertEquals(3, actual);
    }

    @Test
    void seventh() {
        int n = 7;
        int actual = solution.fib(n);
        assertEquals(13, actual);
    }
}
