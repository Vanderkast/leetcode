package com.vanderkast.leetcode;

import org.junit.jupiter.api.Test;

class FirstBadVersionTest {
    void test(int n, int badVersion) {
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
