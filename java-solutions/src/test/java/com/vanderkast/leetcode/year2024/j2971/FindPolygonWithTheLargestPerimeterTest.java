package com.vanderkast.leetcode.year2024.j2971;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPolygonWithTheLargestPerimeterTest {
    private final FindPolygonWithTheLargestPerimeter solution = new FindPolygonWithTheLargestPerimeter();

    @Test
    void leetcodeExample1() {
        var nums = new int[]{1, 12, 1, 2, 5, 50, 3};
        var expected = 12;
        var actual = solution.largestPerimeter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var nums = new int[]{5, 5, 5};
        var expected = 15;
        var actual = solution.largestPerimeter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var nums = new int[]{5, 5, 50};
        var expected = -1;
        var actual = solution.largestPerimeter(nums);
        assertEquals(expected, actual);
    }


    @Test
    void intOverflow() {
        int side = Integer.MAX_VALUE / 3 + 2;
        var nums = new int[]{side, side, side};
        var expected = (long) side * 3;
        var actual = solution.largestPerimeter(nums);
        assertEquals(expected, actual);
    }

    @Test
    void vulnerable() {
        var nums = new int[]{5, 5, 10, 19};
        var expected = 39;
        var actual = solution.largestPerimeter(nums);
        assertEquals(expected, actual);
    }
}
