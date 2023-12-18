package com.vanderkast.leetcode.year2023.j2353;

import java.util.*;

public class FoodRatings {
    HashMap<String, String> foodCuisines;
    HashMap<String, Integer> foodRatings;
    HashMap<String, TreeSet<String>> cuisinesFoodRatings;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodCuisines = new HashMap<>(foods.length);
        foodRatings = new HashMap<>(foods.length);
        cuisinesFoodRatings = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            foodCuisines.put(foods[i], cuisines[i]);
            foodRatings.put(foods[i], ratings[i]);
            TreeSet<String> foodTop = cuisinesFoodRatings.get(cuisines[i]);
            if (foodTop == null) {
                foodTop = new TreeSet<>((a, b) -> {
                    int aR = foodRatings.get(a);
                    int bR = foodRatings.get(b);
                    if (aR != bR)
                        return aR < bR ? -1 : 1;
                    return b.compareTo(a);
                });
                cuisinesFoodRatings.put(cuisines[i], foodTop);
            }
            foodTop.add(foods[i]);
        }
    }

    public void changeRating(String food, int newRating) {
        TreeSet<String> rating = cuisinesFoodRatings.get(foodCuisines.get(food));
        rating.remove(food);
        foodRatings.put(food, newRating);
        rating.add(food);
    }

    public String highestRated(String cuisine) {
        return cuisinesFoodRatings.get(cuisine).last();
    }
}
