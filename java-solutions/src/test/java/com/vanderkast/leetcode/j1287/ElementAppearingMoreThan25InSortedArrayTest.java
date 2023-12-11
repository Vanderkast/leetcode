package com.vanderkast.leetcode.j1287;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ElementAppearingMoreThan25InSortedArrayTest {
    private final ElementAppearingMoreThan25InSortedArray solution = new ElementAppearingMoreThan25InSortedArray();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int[] arr, int expected) {
        var actual = solution.findSpecialInteger(arr);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                arguments(new int[]{1}, 1),
                arguments(new int[]{1, 1}, 1),
                arguments(new int[]{1, 2, 3, 3}, 3),
                arguments(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}, 6)
        );
    }
}
