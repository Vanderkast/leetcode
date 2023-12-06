package com.vanderkast.leetcode.j1716;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateMoneyInLeetcodeBankTest {
    private final CalculateMoneyInLeetcodeBank solution = new CalculateMoneyInLeetcodeBank();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int days, int expected) {
        var actual = solution.totalMoney(days);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.arguments(1, 1),
                Arguments.arguments(4, 10),
                Arguments.arguments(10, 37),
                Arguments.arguments(20, 96)
        );
    }
}
