package com.vanderkast.leetcode.year2024.j1239;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumLengthOfConcatenatedStringWithUniqueCharactersTest {
    private final MaximumLengthOfConcatenatedStringWithUniqueCharacters solution =
            new MaximumLengthOfConcatenatedStringWithUniqueCharacters();

    @Test
    void strToBits() {
        var str = "a";
        var expected = 0b1;
        var actual = solution.strToCode(str);
        assertEquals(expected, actual);
    }

    @Test
    void strToBits_alphabet() {
        var str = "abcdefghijklmnopqrstuvwxyz";
        var expected = 0b11111111111111111111111111;
        var actual = solution.strToCode(str);
        assertEquals(expected, actual);
    }

    @Test
    void strToBits_duplicate() {
        var str = "abca";
        var expected = -1;
        var actual = solution.strToCode(str);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample1() {
        var arr = List.of("un", "iq", "ue");
        var expected = 4;
        var actual = solution.maxLength(arr);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var arr = List.of("cha", "r", "act", "ers");
        var expected = 6;
        var actual = solution.maxLength(arr);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var arr = List.of("abcdefghijklmnopqrstuvwxyz");
        var expected = 26;
        var actual = solution.maxLength(arr);
        assertEquals(expected, actual);
    }


    @Test
    void leetcode53() {
        var arr = List.of("jnfbyktlrqumowxd", "mvhgcpxnjzrdei");
        var expected = 16;
        var actual = solution.maxLength(arr);
        assertEquals(expected, actual);
    }

    @Test
    void leetcode53_1() {
        var a = "jnfbyktlrqumowxd";
        var aBits = solution.strToCode(a);
        assertEquals(16, onesCount(aBits));
        var b = "mvhgcpxnjzrdei";
        var bBits = solution.strToCode(b);
        assertEquals(14, onesCount(bBits));
    }

    int onesCount(int bits) {
        int len = 0;
        while (bits > 0) {
            if ((bits & 1) == 1)
                ++len;
            bits >>= 1;
        }
        return len;
    }

    @Test
    void oneGo() {
        var arr = List.of("ab", "bc", "ca");
        var expected = 2;
        var actual = solution.maxLength(arr);
        assertEquals(expected, actual);
    }

    @Test
    void noone() {
        var arr = List.of("aa", "bb", "cc");
        var expected = 0;
        var actual = solution.maxLength(arr);
        assertEquals(expected, actual);
    }
}
