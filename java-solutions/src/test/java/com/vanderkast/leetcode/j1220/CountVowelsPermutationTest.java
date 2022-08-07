package com.vanderkast.leetcode.j1220;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsPermutationTest {
    private final CountVowelsPermutation solution = new CountVowelsPermutation();

    @Test
    void leetcode1() {
        int n = 1;
        int expected = 5;
        int actual = solution.countVowelPermutation(n);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        int n = 2;
        int expected = 10;
        int actual = solution.countVowelPermutation(n);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode3() {
        int n = 5;
        int expected = 68;
        int actual = solution.countVowelPermutation(n);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode7() {
        int n = 144;
        int expected = 18_208_803;
        int actual = solution.countVowelPermutation(n);
        assertEquals(expected, actual);
    }
}
