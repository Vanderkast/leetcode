package com.vanderkast.leetcode.tools;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Matrix {
    private Matrix() {
    }

    public static int[][] matrix(String view) {
        view = view.strip();
        if (view.charAt(0) != '[')
            throw new IllegalArgumentException("Matrix view must start with \"[\"");
        if (view.charAt(view.length() - 1) != ']')
            throw new IllegalArgumentException("Matrix view must end with \"]\"");
        if (view.length() == 2)
            return new int[][]{};
        String[] rows = view.substring(1, view.length() - 1).split("],\\s*\\[");
        int[][] matrix = new int[rows.length][];
        for (int i = 0; i < matrix.length; i++)
            matrix[i] = row(rows[i]);
        return matrix;
    }

    public static int[] row(String view) {
        if (view.length() == 2)
            return new int[]{};
        int from = view.startsWith("[") ? 1 : 0;
        int to = view.length() - (view.endsWith("]") ? 1 : 0);
        return Arrays.stream(view.substring(from, to)
                        .split(",\\s*"))
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    public static int[][] matrix(int[]... lines) {
        return lines;
    }

    public static int[][] zero(int h, int w) {
        return new int[h][w];
    }

    public static int[] row(int... elems) {
        return elems;
    }

    public static void assertMatrixEquals(int[][] a, int[][] b) {
        assertEquals(a.length, b.length, "Matrices have different heights");
        int h = a.length;
        for (int y = 0; y < h; y++) {
            assertArrayEquals(a[y], b[y], "Matrices contents differ on row [" + y + "]");
        }
    }
}
