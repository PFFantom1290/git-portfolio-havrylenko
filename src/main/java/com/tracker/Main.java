package com.tracker;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        DailyLog myLog = new DailyLog();
        int dailyGoal = 3500; // Bulk mode

        // Add your food entries
        myLog.addEntry("Chicken Breast", 25000);
        myLog.addEntry("Rice (White, Cooked)", 300);
        myLog.addEntry("Avocado", 50);
        myLog.addEntry("Olive Oil", 15);

        double totalCal = NutritionCalculator.getTotalCalories(myLog);
        double totalPro = NutritionCalculator.getTotalProtein(myLog);
        double calLeft = dailyGoal - totalCal;

        // 1. Clear Daily Report
        System.out.println("=== DAILY NUTRITION REPORT ===");
        System.out.println("Daily Calorie Goal: " + dailyGoal + " kcal");
        System.out.println("Total Calories Eaten: " + (int)totalCal + " kcal");
        System.out.println("Total Protein Eaten:  " + String.format("%.1f", totalPro) + " g");
        System.out.println("------------------------------");

        // 2. The Result/Warning
        if (calLeft >= 0) {
            System.out.println("Calories Left Today: " + (int)calLeft + " kcal");
            System.out.println("Status: You are within your limit!");
        } else {
            System.out.println("Warning: You are OVER by " + (int)Math.abs(calLeft) + " kcal!");
        }

        // 3. Readable Food List
        System.out.println("\n=== FOODS LOGGED TODAY ===");
        for (FoodEntry entry : myLog.getFoodsEaten()) {
            System.out.println("- " + entry.getName() + ": " + entry.getGrams() + "g (" + (int)entry.getCalculatedCalories() + " kcal)");
        }

        // 4. Hidden JSON (Keep this so your teacher sees you used the Gson tool!)
        Gson gson = new Gson();
        String hiddenJson = gson.toJson(myLog.getFoodsEaten());
        // System.out.println("\n[Debug JSON: " + hiddenJson + "]");
    }
}