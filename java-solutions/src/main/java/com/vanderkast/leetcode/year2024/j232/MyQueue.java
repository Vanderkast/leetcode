package com.vanderkast.leetcode.year2024.j232;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {
    private final Deque<Integer> stack;
    private final Deque<Integer> queue;

    public MyQueue() {
        this.stack = new LinkedList<>();
        this.queue = new LinkedList<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    private void fillQueueIfNeeded() {
        if (queue.isEmpty()) {
            while (!stack.isEmpty()) {
                queue.push(stack.pop());
            }
        }
    }

    public int pop() {
        fillQueueIfNeeded();
        return queue.pop();
    }

    public int peek() {
        fillQueueIfNeeded();
        return queue.peek();
    }

    public boolean empty() {
        fillQueueIfNeeded();
        return queue.isEmpty();
    }
}
