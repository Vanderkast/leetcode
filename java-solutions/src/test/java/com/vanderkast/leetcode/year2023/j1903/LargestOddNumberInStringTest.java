package com.vanderkast.leetcode.year2023.j1903;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LargestOddNumberInStringTest {
    private final LargestOddNumberInString solution = new LargestOddNumberInString();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(String num, String expected) {
        var actual = solution.largestOddNumber(num);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.arguments("1", "1"),
                Arguments.arguments("52", "5"),
                Arguments.arguments("4206", ""),
                Arguments.arguments("35427", "35427")
        );
    }
}
