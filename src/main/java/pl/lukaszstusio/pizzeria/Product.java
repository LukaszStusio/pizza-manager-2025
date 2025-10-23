package pl.lukaszstusio.pizzeria;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {
    protected String name;
    protected int price;
    protected boolean vegan;

    public Product(String name, int price, boolean vegan) {
        this.name = name;
        this.price = price;
        this.vegan = vegan;
    }

    public abstract String toString();
}
