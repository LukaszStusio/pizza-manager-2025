package pl.lukaszstusio.pizzeria;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredient extends Product {

    private int unit;
    private boolean allergen;

    public Ingredient(String name, int price, boolean vegan, int unit, boolean allergen) {
        super(name, price, vegan);
        this.unit = unit;
        this.allergen = allergen;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", vegan=" + vegan +
                ", unit=" + unit +
                ", allergen=" + allergen +
                '}';
    }
}
