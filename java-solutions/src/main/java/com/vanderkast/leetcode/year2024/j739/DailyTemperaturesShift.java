package com.vanderkast.leetcode.year2024.j739;

public class DailyTemperaturesShift extends DailyTemperatures {
    @Override
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] answer = new int[len];
        int cur;
        for (int i = 1; i < len; i++) {
            cur = temperatures[i];
            int j = i - 1;
            while (j >= 0 && temperatures[j] < cur) {
                if (answer[j] == 0)
                    answer[j] = i - j;
                --j;
            }
        }
        return answer;
    }
}
