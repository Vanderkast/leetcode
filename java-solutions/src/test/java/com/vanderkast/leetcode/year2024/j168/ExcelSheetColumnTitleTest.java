package com.vanderkast.leetcode.year2024.j168;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcelSheetColumnTitleTest {
    private final ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

    @ParameterizedTest
    @ValueSource(chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'})
    void alphabet(char letter) {
        var actual = solution.convertToTitle(letter - 'A' + 1);
        assertEquals(String.valueOf(letter), actual);
    }

    @ParameterizedTest
    @ValueSource(chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'})
    void twoDigits(char letter) {
        var actual = solution.convertToTitle(26 + (letter - 'A' + 1));
        assertEquals("A" + letter, actual);
    }

    @Test
    void leetcodeExample2() {
        var column = 28;
        var expected = "AB";
        var actual = solution.convertToTitle(column);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var column = 701;
        var expected = "ZY";
        var actual = solution.convertToTitle(column);
        assertEquals(expected, actual);
    }
}
