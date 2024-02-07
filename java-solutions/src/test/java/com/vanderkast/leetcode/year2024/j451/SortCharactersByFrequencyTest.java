package com.vanderkast.leetcode.year2024.j451;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortCharactersByFrequencyTest {
    private final SortCharactersByFrequency solution;

    SortCharactersByFrequencyTest(SortCharactersByFrequency solution) {
        this.solution = solution;
    }

    @Test
    void leetcodeExample1() {
        var s = "tree";
        var expected = Set.of("eetr", "eert");
        var actual = solution.frequencySort(s);
        assertExpectedContainsActual(expected, actual);
    }

    @Test
    void leetcodeExample2() {
        var s = "cccaaa";
        var expected = Set.of("cccaaa", "aaaccc");
        var actual = solution.frequencySort(s);
        assertExpectedContainsActual(expected, actual);
    }

    @Test
    void leetcodeExample3() {
        var s = "Aabb";
        var expected = Set.of("bbaA", "bbAa");
        var actual = solution.frequencySort(s);
        assertExpectedContainsActual(expected, actual);
    }

    @Test
    void leetcodeTest22() {
        var s = "raaeaedere";
        var expected = Set.of("eeeeaaarrd");
        var actual = solution.frequencySort(s);
        assertExpectedContainsActual(expected, actual);
    }

    private <T> void assertExpectedContainsActual(Set<T> expected, T actual) {
        assertTrue(expected.contains(actual), "Actual value \"" + actual + "\" is not present in expected set: " + expected);
    }
}
