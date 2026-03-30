package com.tracker;

public class NutritionCalculator {

    public static double getTotalCalories(DailyLog log) {
        double total = 0;
        for (FoodEntry entry : log.getFoodsEaten()) {
            total += entry.getCalculatedCalories();
        }
        return total;
    }

    public static double getTotalProtein(DailyLog log) {
        double total = 0;
        for (FoodEntry entry : log.getFoodsEaten()) {
            total += entry.getCalculatedProtein();
        }
        return total;
    }
}