package com.vanderkast.leetcode.year2023.j1688;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountOfMatchesInTournamentTest {
    private final CountOfMatchesInTournament solution = new CountOfMatchesInTournament();

    @ParameterizedTest
    @MethodSource("testParameters")
    void test(int teamsCount, int expectedMatches) {
        var actual = solution.numberOfMatches(teamsCount);
        assertEquals(expectedMatches, actual);
    }

    static Stream<Arguments> testParameters() {
        return Stream.of(
                Arguments.arguments(7, 6),
                Arguments.arguments(14, 13),
                Arguments.arguments(1, 0)
        );
    }
}
