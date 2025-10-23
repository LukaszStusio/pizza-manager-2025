package pl.lukaszstusio.pizzeria;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizza extends Product {
    private List<Ingredient> ingredients;

    public Pizza(String name, int price, boolean vegan, List<Ingredient> ingredients) {
        super(name, price, vegan);
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", vegan=" + vegan +
                ", ingredients=" + ingredients +
                '}';
    }
}

