package com.vanderkast.leetcode.j1010;

import net.vanderkast.leetcode.commons.test.ResourcesUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PairsOfSongsWithTotalDurationsDivisibleBy60Test {
    private final PairsOfSongsWithTotalDurationsDivisibleBy60 solution =
            new PairsOfSongsWithTotalDurationsDivisibleBy60();

    @Test
    void leetcode1() {
        // given
        var songDurations = new int[]{30, 20, 150, 100, 40};
        var expected = 3;
        // when
        var actual = solution.numPairsDivisibleBy60(songDurations);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void leetcode2() {
        // given
        var songDurations = new int[]{60, 60, 60};
        var expected = 3;
        // when
        var actual = solution.numPairsDivisibleBy60(songDurations);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void singleElement() {
        // given
        var songDurations = new int[]{20};
        var expected = 0;
        // when
        var actual = solution.numPairsDivisibleBy60(songDurations);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void leetcode34() throws IOException {
        // given
        var songDurations = ResourcesUtils.readFromResource(int[].class, "j1010/leetcode34.txt");
        var expected = 6780767;
        // when
        var actual = solution.numPairsDivisibleBy60(songDurations);
        // then
        assertEquals(expected, actual);
    }
}
