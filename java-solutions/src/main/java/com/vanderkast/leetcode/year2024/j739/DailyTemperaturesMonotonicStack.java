package com.vanderkast.leetcode.year2024.j739;

import java.util.Deque;
import java.util.LinkedList;

public class DailyTemperaturesMonotonicStack extends DailyTemperatures {
    @Override
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] answer = new int[len];
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        for (int i = 1; i < len; i++) {
            if (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                    int j = stack.pop();
                    answer[j] = i - j;
                }
            }
            stack.push(i);
        }
        return answer;
    }
}
