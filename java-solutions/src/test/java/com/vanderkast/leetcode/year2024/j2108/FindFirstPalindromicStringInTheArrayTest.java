package com.vanderkast.leetcode.year2024.j2108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindFirstPalindromicStringInTheArrayTest {
    private final FindFirstPalindromicStringInTheArray solution = new FindFirstPalindromicStringInTheArray();

    @Test
    void leetcodeExample1() {
        var words = new String[]{"abc", "car", "ada", "racecar", "cool"};
        var expected = "ada";
        var actual = solution.firstPalindrome(words);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var words = new String[]{"notapalindrome", "racecar"};
        var expected = "racecar";
        var actual = solution.firstPalindrome(words);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var words = new String[]{"def", "ghi"};
        var expected = "";
        var actual = solution.firstPalindrome(words);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeTest7() {
        var words = new String[]{"cqllrtyhw","swwisru","gpzmbders","wqibjuqvs","pp","usewxryy","ybqfuh","hqwwqftgyu","jggmatpk"};
        var expected = "pp";
        var actual = solution.firstPalindrome(words);
        assertEquals(expected, actual);
    }
}
