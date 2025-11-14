package pl.lukaszstusio.pizzeria.pizza;

import lombok.Getter;
import lombok.Setter;
import pl.lukaszstusio.pizzeria.Ingredient;
import pl.lukaszstusio.pizzeria.product.Product;

import java.util.List;
@Getter
@Setter
public class Pizza extends Product {
    private List<Ingredient> ingredients;

    public Pizza(String name, int price, boolean vegan, List<Ingredient> ingredients) {
        super(name, price, vegan);

        if (ingredients == null) {
            throw new NullPizzaIngredientsException("Ingredient cannot be null");
        }

        if (ingredients.isEmpty()) {
            throw new EmptyPizzaIngredientsException("Empty list of ingredients");
        }

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

