package com.tracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NutritionCalculatorTest {

    @Test
    public void testDatabaseLookup() {
        // This checks if the program finds "Eggs" in your database
        FoodItem egg = FoodDatabase.getFood("Eggs");
        assertNotNull(egg);
        assertEquals(155.0, egg.getCalories(), 0.1);
    }

    @Test
    public void testWeightCalculation() {
        // If 100g of Oats is 389 cal, then 200g must be 778
        DailyLog log = new DailyLog();
        log.addEntry("Oats", 200);

        double total = NutritionCalculator.getTotalCalories(log);
        assertEquals(778.0, total, 0.1);
    }

    @Test
    public void testTotalProtein() {
        // This checks if it adds protein from two foods correctly
        DailyLog log = new DailyLog();
        log.addEntry("Chicken Breast", 100); // 31g protein
        log.addEntry("Eggs", 100);           // 13g protein

        double totalProtein = NutritionCalculator.getTotalProtein(log);
        assertEquals(44.0, totalProtein, 0.1);
    }
}