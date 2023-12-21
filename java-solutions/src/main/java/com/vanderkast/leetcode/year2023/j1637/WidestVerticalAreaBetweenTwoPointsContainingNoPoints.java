package com.vanderkast.leetcode.year2023.j1637;

import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xs = new int[points.length];
        for (int i = 0; i < points.length; i++)
            xs[i] = points[i][0];
        Arrays.sort(xs);
        int max = Integer.MIN_VALUE;
        int prev = xs[0];
        int cur;
        for (int i = 1; i < points.length; i++) {
            cur = xs[i];
            if (cur - prev > max)
                max = cur - prev;
            prev = cur;
        }
        return max;
    }
}
