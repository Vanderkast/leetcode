package com.vanderkast.leetcode.year2023.j2353;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodRatingsTest {
    @Test
    void leetcodeExample1() {
        var givenFood = new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
        var givenCuisines = new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"};
        var givenRatings = new int[]{9, 12, 8, 15, 14, 7};
        var foodRatings = new FoodRatings(givenFood, givenCuisines, givenRatings);

        assertEquals("kimchi", foodRatings.highestRated("korean"));
        assertEquals("ramen", foodRatings.highestRated("japanese"));

        foodRatings.changeRating("sushi", 16);
        assertEquals("sushi", foodRatings.highestRated("japanese"));

        foodRatings.changeRating("ramen", 16);
        assertEquals("ramen", foodRatings.highestRated("japanese"));
    }

    @Test
    void test1() {
        var ratings = new FoodRatings(
                new String[]{"A", "B"},
                new String[]{"aaa", "aaa"},
                new int[]{5, 10}
        );

        assertEquals("B", ratings.highestRated("aaa"));

        ratings.changeRating("B", 4);

        assertEquals("A", ratings.highestRated("aaa"));
    }

    @Test
    void test2() {
        var ratings = new FoodRatings(
                new String[]{"AA", "AB"},
                new String[]{"aaa", "aaa"},
                new int[]{5, 10}
        );

        assertEquals("AB", ratings.highestRated("aaa"));

        ratings.changeRating("AA", 10);

        assertEquals("AA", ratings.highestRated("aaa"));
    }
}
