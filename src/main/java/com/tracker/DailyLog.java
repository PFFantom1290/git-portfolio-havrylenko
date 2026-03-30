package com.tracker;

import java.util.ArrayList;
import java.util.List;

public class DailyLog {
    private List<FoodEntry> foodsEaten;

    public DailyLog() {
        this.foodsEaten = new ArrayList<>();
    }

    public void addEntry(String foodName, int grams) {
        FoodItem item = FoodDatabase.getFood(foodName);
        foodsEaten.add(new FoodEntry(item, grams));
    }

    public List<FoodEntry> getFoodsEaten() {
        return foodsEaten;
    }
}