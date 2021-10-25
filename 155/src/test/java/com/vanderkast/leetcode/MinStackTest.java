package com.vanderkast.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Test
    void leetcode1() {
        var solution = new MinStack();
        solution.push(-2);
        solution.push(0);
        solution.push(-3);

        assertEquals(-3, solution.getMin());
        solution.pop();
        assertEquals(0, solution.top());
        assertEquals(-2, solution.getMin());
    }

    @Test
    void popPush() {
        var solution = new MinStack();
        solution.push(10);
        solution.pop();
        solution.push(2);

        assertEquals(2, solution.getMin());
    }
}
