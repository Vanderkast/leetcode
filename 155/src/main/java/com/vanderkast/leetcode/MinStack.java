package com.vanderkast.leetcode;

import java.util.Objects;

public class MinStack {
    private Node top;
    private MinNode topMin;

    // leetcode does not work with records!
    static class Node {
        final int value;
        final Node previous;

        Node(int value, Node previous) {
            this.value = value;
            this.previous = previous;
        }
    }

    static class MinNode {
        private final Node node;
        private final MinNode previous;

        MinNode(Node node, MinNode previous) {
            this.node = node;
            this.previous = previous;
        }
    }

    public MinStack() {
        top = null;
        topMin = new MinNode(new Node(Integer.MAX_VALUE, null), null);
    }

    public void push(int value) {
        top = new Node(value, top);
        if(value < topMin.node.value) {
            topMin = new MinNode(top, topMin);
        }
    }

    public void pop() {
        if(top == topMin.node)
            topMin = topMin.previous;
        top = top.previous;
    }

    public int top() {
        return top.value;
    }

    public int getMin() {
        return topMin.node.value;
    }
}
