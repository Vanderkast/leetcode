package com.vanderkast.leetcode.j380;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {

    @Test
    void leetcode11() {
        var set = new RandomizedSet();
        assertTrue(set.insert(3));
        assertFalse(set.insert(3));
        assertEquals(3, set.getRandom());
        assertEquals(3, set.getRandom());
        assertTrue(set.insert(1));
        assertTrue(set.remove(3));
        assertEquals(1, set.getRandom());
        assertEquals(1, set.getRandom());
        assertTrue(set.insert(0));
        assertTrue(set.remove(0));
    }
}
