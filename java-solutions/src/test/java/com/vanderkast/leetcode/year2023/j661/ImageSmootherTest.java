package com.vanderkast.leetcode.year2023.j661;

import org.junit.jupiter.api.Test;

import static com.vanderkast.leetcode.tools.Matrix.*;
import static org.junit.jupiter.api.Assertions.*;

class ImageSmootherTest {
    private final ImageSmoother solution = new ImageSmoother();

    @Test
    void leetcodeExample1() {
        var given = matrix(
                row(1, 1, 1),
                row(1, 0, 1),
                row(1, 1, 1)
        );
        var expected = zero(3, 3);
        var actual = solution.imageSmoother(given);
        assertMatrixEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var given = matrix(
                row(100, 200, 100),
                row(200, 50, 200),
                row(100, 200, 100)
        );
        var expected = matrix(
                row(137, 141, 137),
                row(141, 138, 141),
                row(137, 141, 137)
        );
        var actual = solution.imageSmoother(given);
        assertMatrixEquals(expected, actual);
    }

    @Test
    void one() {
        var given = matrix(
                row(1)
        );
        var expected = matrix(
                row(1)
        );
        var actual = solution.imageSmoother(given);
        assertMatrixEquals(expected, actual);
    }
}
