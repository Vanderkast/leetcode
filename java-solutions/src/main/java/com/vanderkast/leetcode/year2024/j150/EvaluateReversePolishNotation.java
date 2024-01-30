package com.vanderkast.leetcode.year2024.j150;

import java.util.Deque;
import java.util.LinkedList;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> operands = new LinkedList<>();
        for (var t : tokens) {
            switch (t) {
                case "*" -> operands.push(operands.pop() * operands.pop());
                case "+" -> operands.push(operands.pop() + operands.pop());
                case "-" -> operands.push(-operands.pop() + operands.pop());
                case "/" -> operands.push((int) (1.0 / operands.pop() * operands.pop()));
                default -> operands.push(Integer.valueOf(t));
            }
        }
        return operands.pop();
    }
}
