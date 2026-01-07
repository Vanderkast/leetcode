package com.vanderkast.leetcode.year2026.j1975;

public class MaximumMatrixSum {
    public long maxMatrixSum(int[][] matrix) {
        boolean has_zeros = false;
        boolean negatives_number_odd = false;
        int max_negative = Integer.MIN_VALUE; // closest to 0
        int min_positive = Integer.MAX_VALUE;
        long sum = 0;
        for (int[] row : matrix) {
            for (int e : row) {
                sum += Math.abs(e);
                if (e == 0)
                    has_zeros = true;
                else if (e < 0) {
                    negatives_number_odd = !negatives_number_odd;
                    if (e > max_negative)
                        max_negative = e;
                } else {
                    min_positive = Math.min(min_positive, e);
                }
            }
        }
        if (negatives_number_odd && !has_zeros) {
            if (min_positive + max_negative < 0)
                sum -= min_positive * 2;
            else
                sum += max_negative * 2;
        }
        return sum;
    }
}
