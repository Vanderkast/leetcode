package com.vanderkast.leetcode.year2026.j1266;

public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        var prev = points[0];
        int length = points.length;
        int total = 0;
        for (int i = 1; i < length; i++) {
            var curr = points[i];
            var diffX = Math.abs(curr[0] - prev[0]);
            var diffY = Math.abs(curr[1] - prev[1]);

            var diagonal_time = Math.min(diffX, diffY);
            var axes_time = Math.abs(diffX - diffY);

            total += diagonal_time + axes_time;
            prev = curr;
        }
        return total;
    }
}
