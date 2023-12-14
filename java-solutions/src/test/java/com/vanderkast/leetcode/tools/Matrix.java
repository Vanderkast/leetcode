package com.vanderkast.leetcode.tools;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Matrix {
    private Matrix() {
    }

    public static int[][] matrix(int[]... lines) {
        return lines;
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
