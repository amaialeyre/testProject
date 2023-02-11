package lesson11task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Menu {
    public static void main(String[] args) {
        List<Pizza> menu = generatePizzasForMenu();

        System.out.println("List of vegan pizzas:");
        printVegan(menu);
        System.out.println();
        System.out.println("List of pizzas contains celery:");
        printContainsCelery(menu);
        System.out.println();
        System.out.println("Is there a vegan pizza that contains tomato and pepper? " + isVeganAndContainsTomatoAndPepper(menu));
        System.out.println();
        System.out.println("Whether all dishes contain mozzarella? " + hasMozzarella(menu));
        System.out.println();
        printPizzaWithHighestCalories(menu);
        System.out.println();
        printPizzaWithLowestCalories(menu);
    }

    private static List<Pizza> generatePizzasForMenu() {
        List<Ingredient> ingredientOne = Arrays.asList(Ingredient.ONION, Ingredient.MOZZARELLA,
                Ingredient.TOMATO);
        List<Ingredient> ingredientTwo = Arrays.asList(Ingredient.SALAMI, Ingredient.MOZZARELLA,
                Ingredient.TOMATO);
        List<Ingredient> ingredientThree = Arrays.asList(Ingredient.CELERY, Ingredient.MOZZARELLA,
                Ingredient.TOMATO);
        List<Ingredient> ingredientFour = Arrays.asList(Ingredient.ONION, Ingredient.MOZZARELLA,
                Ingredient.TOMATO, Ingredient.MUSHROOMS);
        List<Ingredient> ingredientFive = Arrays.asList(Ingredient.ONION, Ingredient.MOZZARELLA,
                Ingredient.TOMATO, Ingredient.CELERY);
        List<Ingredient> ingredientSixes = Arrays.asList(Ingredient.ONION, Ingredient.MOZZARELLA,
                Ingredient.TOMATO, Ingredient.PEPPERS);
        List<Ingredient> ingredientSeven = Arrays.asList(Ingredient.ONION, Ingredient.MOZZARELLA,
                Ingredient.TOMATO, Ingredient.PEPPERS, Ingredient.MUSHROOMS);
        List<Ingredient> ingredientEight = Arrays.asList(Ingredient.SALAMI, Ingredient.MOZZARELLA,
                Ingredient.TOMATO, Ingredient.PEPPERS);
        List<Ingredient> ingredientNine = Arrays.asList(Ingredient.SALAMI, Ingredient.CELERY,
                Ingredient.TOMATO);
        List<Ingredient> ingredientTen = Arrays.asList(Ingredient.MUSHROOMS, Ingredient.MOZZARELLA,
                Ingredient.TOMATO);

        Pizza pizzaOne = new Pizza(ingredientOne, true, 550, "pizzaOne");
        Pizza pizzaTwo = new Pizza(ingredientTwo, false, 480, "pizzaTwo");
        Pizza pizzaThree = new Pizza(ingredientThree, true, 750, "pizzaThree");
        Pizza pizzaFour = new Pizza(ingredientFour, true, 620, "pizzaFour");
        Pizza pizzaFive = new Pizza(ingredientFive, true, 370, "pizzaFive");
        Pizza pizzaSix = new Pizza(ingredientSixes, true, 920, "pizzaSix");
        Pizza pizzaSeven = new Pizza(ingredientSeven, true, 800, "pizzaSeven");
        Pizza pizzaEight = new Pizza(ingredientEight, false, 600, "pizzaEight");
        Pizza pizzaNine = new Pizza(ingredientNine, false, 500, "pizzaNine");
        Pizza pizzaTen = new Pizza(ingredientTen, true, 690, "pizzaTen");

        return Arrays.asList(pizzaOne, pizzaTwo, pizzaThree, pizzaFour, pizzaFive, pizzaSix, pizzaSeven,
                pizzaEight, pizzaNine, pizzaTen);
    }

    private static void printVegan(List<Pizza> menu) {
        menu.stream()
                .filter(Pizza::isVegan)
                .map(Pizza::getName)
                .forEach(System.out::println);
    }

    private static void printContainsCelery(List<Pizza> menu) {
        menu.stream()
                .filter(pizza -> pizza.getIngredients().contains(Ingredient.CELERY))
                .map(Pizza::getName)
                .forEach(System.out::println);
    }

    private static boolean isVeganAndContainsTomatoAndPepper(List<Pizza> menu) {
        return menu.stream()
                .anyMatch(pizza -> pizza.isVegan() && containsTomato(pizza) && containsPeppers(pizza));
    }

    private static boolean containsPeppers(Pizza pizza) {
        return pizza.getIngredients().contains(Ingredient.PEPPERS);
    }

    private static boolean containsTomato(Pizza pizza) {
        return pizza.getIngredients().contains(Ingredient.TOMATO);
    }

    private static boolean hasMozzarella(List<Pizza> menu) {
        return menu.stream()
                .allMatch(Menu::containsMozzarella);
    }

    private static boolean containsMozzarella(Pizza pizza) {
        return pizza.getIngredients().contains(Ingredient.MOZZARELLA);
    }

    private static void printPizzaWithHighestCalories(List<Pizza> menu) {
        Pizza maxCalories = menu
                .stream()
                .max(Comparator.comparing(Pizza::getCalories))
                .orElseThrow();
        System.out.println("Pizza with highest calories is: " + maxCalories);
    }

    private static void printPizzaWithLowestCalories(List<Pizza> menu) {
        Pizza minCalories = menu
                .stream()
                .min(Comparator.comparing(Pizza::getCalories))
                .orElseThrow();
        System.out.println("Pizza with lowest calories is: " + minCalories);
    }
}
