package com.vanderkast.leetcode.year2024.j387;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInStringTest {
    private final FirstUniqueCharacterInString solution = new FirstUniqueCharacterInString();

    @Test
    void leetcodeExample1() {
        var s = "leetcode";
        var expected = 0;
        var actual = solution.firstUniqChar(s);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var s = "loveleetcode";
        var expected = 2;
        var actual = solution.firstUniqChar(s);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var s = "aabb";
        var expected = -1;
        var actual = solution.firstUniqChar(s);
        assertEquals(expected, actual);
    }
}
