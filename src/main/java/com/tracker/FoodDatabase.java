package com.tracker;

import org.apache.commons.lang3.StringUtils;
import java.util.HashMap;
import java.util.Map;

public class FoodDatabase {
    private static final Map<String, FoodItem> db = new HashMap<>();

    static {
        // MEATS & PROTEINS
        add("Chicken Breast", 165, 31, 3.6, 0);
        add("Turkey Breast", 147, 30, 1.5, 0);
        add("Beef (Lean)", 250, 26, 15, 0);
        add("Pork Chop", 231, 24, 14, 0);
        add("Bacon", 541, 37, 42, 1.4);
        add("Salmon", 208, 20, 13, 0);
        add("Tuna (Canned)", 132, 28, 1, 0);
        add("Eggs", 155, 13, 11, 1.1);
        add("Tofu", 144, 16, 9, 3);

        // DAIRY
        add("Milk (Whole)", 61, 3.2, 3.3, 4.8);
        add("Cheese (Cheddar)", 402, 25, 33, 1.3);
        add("Yogurt (Greek)", 97, 10, 5, 4);
        add("Butter", 717, 0.9, 81, 0.1);
        add("Cottage Cheese", 98, 11, 4.3, 3.4);

        // CARBS & GRAINS
        add("Rice (White, Cooked)", 130, 2.7, 0.3, 28);
        add("Rice (Brown, Cooked)", 111, 2.6, 0.9, 23);
        add("Pasta (Cooked)", 131, 5, 1, 25);
        add("Oats", 389, 16.9, 6.9, 66);
        add("Bread (White)", 265, 9, 3.2, 49);
        add("Bread (Whole Wheat)", 252, 12, 3.5, 43);
        add("Potato (Baked)", 93, 2.5, 0.1, 21);
        add("Sweet Potato", 86, 1.6, 0.1, 20);

        // LEGUMES
        add("Lentils (Cooked)", 116, 9, 0.4, 20);
        add("Chickpeas (Cooked)", 164, 8.9, 2.6, 27);
        add("Black Beans", 132, 8.9, 0.5, 24);
        add("Green Peas", 81, 5.4, 0.4, 14);

        // VEGETABLES
        add("Broccoli", 34, 2.8, 0.4, 6.6);
        add("Spinach", 23, 2.9, 0.4, 3.6);
        add("Carrot", 41, 0.9, 0.2, 10);
        add("Tomato", 18, 0.9, 0.2, 3.9);
        add("Cucumber", 15, 0.65, 0.1, 3.6);
        add("Onion", 40, 1.1, 0.1, 9);
        add("Garlic", 149, 6.4, 0.5, 33);
        add("Mushroom", 22, 3.1, 0.3, 3.3);
        add("Corn", 86, 3.2, 1.2, 19);

        // FRUITS
        add("Apple", 52, 0.3, 0.2, 14);
        add("Banana", 89, 1.1, 0.3, 23);
        add("Orange", 47, 0.9, 0.1, 12);
        add("Grapes", 69, 0.7, 0.2, 18);
        add("Strawberries", 32, 0.7, 0.3, 7.7);
        add("Blueberries", 57, 0.7, 0.3, 14);
        add("Avocado", 160, 2, 15, 9);

        // NUTS, SEEDS & FATS
        add("Almonds", 579, 21, 50, 22);
        add("Walnuts", 654, 15, 65, 14);
        add("Peanuts", 567, 26, 49, 16);
        add("Peanut Butter", 588, 25, 50, 20);
        add("Olive Oil", 884, 0, 100, 0);

        // SWEETS & OTHER
        add("Honey", 304, 0.3, 0, 82);
        add("Sugar", 387, 0, 0, 100);
        add("Dark Chocolate", 598, 8, 43, 46);
    }

    private static void add(String name, double cal, double pro, double fat, double carbs) {
        db.put(name.toLowerCase(), new FoodItem(name, cal, pro, fat, carbs));
    }

    public static FoodItem getFood(String name) {
        // Clean the input string and search
        String searchName = StringUtils.trimToEmpty(name).toLowerCase();
        FoodItem found = db.get(searchName);

        if (found == null) {
            System.out.println("WARNING: '" + name + "' not found in database! Assuming 0 macros.");
            return new FoodItem(name, 0, 0, 0, 0);
        }
        return found;
    }
}