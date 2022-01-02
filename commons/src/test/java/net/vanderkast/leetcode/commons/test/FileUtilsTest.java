package net.vanderkast.leetcode.commons.test;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {
    @Test
    void parserIntArray() throws IOException {
        // given
        var filePath = "FileUtilsTest/intarray.txt";
        var expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // when
        var actual = ResourcesUtils.readFromResource(expected.getClass(), filePath);
        //then
        assertArrayEquals(expected, actual);
    }
}
