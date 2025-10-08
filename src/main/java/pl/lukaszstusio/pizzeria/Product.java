package pl.lukaszstusio.pizzeria;

import java.util.List;

public class Product {
    private String name;
    private int price;
    private boolean vegan;
    private List<Ingredient> ingredients;

    public Product(String name, int price, boolean vegan) {
        this.name = name;
        this.price = price;
        this.vegan = vegan;
    }

    public Product(String name, int price, boolean vegan, List<Ingredient> ingredients) {
        this.name = name;
        this.price = price;
        this.vegan = vegan;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}

