package lesson11task2;

import java.util.List;

public class Pizza {

    private final List<Ingredient> ingredients;
    private final boolean isVegan;
    private final Integer calories;
    private final String name;

    public Pizza(List<Ingredient> ingredients, boolean isVegan, Integer calories, String name) {
        this.ingredients = ingredients;
        this.isVegan = isVegan;
        this.calories = calories;
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public Integer getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
