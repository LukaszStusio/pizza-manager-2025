package pl.lukaszstusio.pizzeria;

public class Ingredient extends Product {
    public Ingredient(String name, int price, boolean vegan) {
        super(name, price, vegan);
    }
    private int unit;
    private boolean allergen;
}
