package com.tracker;

public class FoodEntry {
    private FoodItem food;
    private int grams;

    public FoodEntry(FoodItem food, int grams) {
        this.food = food;
        this.grams = grams;
    }

    public String getName() { return food.getName(); }
    public int getGrams() { return grams; }

    // Math: (base per 100g / 100) * grams eaten
    public double getCalculatedCalories() { return (food.getCalories() / 100.0) * grams; }
    public double getCalculatedProtein() { return (food.getProtein() / 100.0) * grams; }
    public double getCalculatedFat() { return (food.getFat() / 100.0) * grams; }
    public double getCalculatedCarbs() { return (food.getCarbs() / 100.0) * grams; }
}