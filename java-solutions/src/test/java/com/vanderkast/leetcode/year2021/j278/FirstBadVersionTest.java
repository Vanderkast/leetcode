package com.vanderkast.leetcode.year2021.j278;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FirstBadVersionTest {
    void test(int n, int badVersion) {
        assertTrue(n >= badVersion);
        assertEquals(badVersion, new FirstBadVersion(badVersion).firstBadVersion(n));
    }

    @Test
    void leetcode1() {
        test(5, 4);
    }

    @Test
    void leetcode2() {
        test(1, 1);
    }

    @Test
    void leetcode11() {
        test(2126753390, 1702766719);
    }
}
