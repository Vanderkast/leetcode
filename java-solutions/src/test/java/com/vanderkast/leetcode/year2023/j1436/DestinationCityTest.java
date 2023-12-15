package com.vanderkast.leetcode.year2023.j1436;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DestinationCityTest {
    private final DestinationCity solution = new DestinationCity();

    @Test
    void leetcodeExample1() {
        var given = List.of(
                List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo")
        );
        var expected = "Sao Paulo";
        var actual = solution.destCity(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var given = List.of(
                List.of("B","C"),
                List.of("D","B"),
                List.of("C","A")
        );
        var expected = "A";
        var actual = solution.destCity(given);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var given = List.of(
                List.of("A","Z")
        );
        var expected = "Z";
        var actual = solution.destCity(given);
        assertEquals(expected, actual);
    }
}
